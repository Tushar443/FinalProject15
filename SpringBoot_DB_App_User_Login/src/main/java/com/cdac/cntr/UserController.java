package com.cdac.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.User;
import com.cdac.service.IUserService;

@RestController
@SpringBootApplication
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	IUserService userService;
	
	@PostMapping(value = "AddUser")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "User Added";
	}
	@GetMapping(value = "getRes")
	public String GetResponse() {
		return "Success";
	}
}
