package com.cdac.dto;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
@Entity
@Table(name = "FileUpload")
public class FileUpload {
	@Id
	@GeneratedValue
	private int imgId;
		
	@Column(name = "profile_photo", length = 5000)
	private byte[] profilePhoto;
	
	
	
	public FileUpload(byte[] profilePhoto) {
		super();
		
		this.profilePhoto = profilePhoto;
	}
	public int getImgId() {
		return imgId;
	}

	public void setImgId(int imgId) {
		this.imgId = imgId;
	}

	public byte[] getProfilePhoto() {
		return profilePhoto;
	}

	public void setProfilePhoto(byte[] profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	@Override
	public String toString() {
		return "FileUpload [imgId=" + imgId + ", profilePhoto=" + Arrays.toString(profilePhoto) + "]";
	}
	
	
}
