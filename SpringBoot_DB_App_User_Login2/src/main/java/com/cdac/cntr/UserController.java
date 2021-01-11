package com.cdac.cntr;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity.BodyBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cdac.dto.FileUpload;
import com.cdac.dto.User;
import com.cdac.repo.UserRepo;
import com.cdac.service.IUserService;

@RestController
@SpringBootApplication
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	IUserService userService;
	@Autowired 
	UserRepo userRepo;
	
//	@PostMapping(value = "AddUser")
//	public String addUser(@RequestBody User user) {
//		userService.addUser(user);
//		return "User Added";
//	}
//	@GetMapping(value = "getRes")
//	public String GetResponse() {
//		return "Success";
//	}
//	
//	@PostMapping(value = "valid") 
//	public String getUser(@RequestBody User user) {
//		User user1 = userService.findUser(user.getUserName(),user.getUserPassword());
//		 if(user1 !=null) {
//			 return "Login"; 
//		 }
//		 else {
//			 return "No Login";
//		 }
//	}
	
	@PostMapping("/upload")
	public BodyBuilder uplaodImage(@RequestParam("imageFile") MultipartFile file) throws IOException {

		System.out.println("Original Image Byte Size - " + file.getBytes().length);
		FileUpload img = new FileUpload(file.getBytes());
		userRepo.save(img);
		return (BodyBuilder) ResponseEntity.status(HttpStatus.OK);
	}
	
	
}
