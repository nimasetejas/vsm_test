package com.veronica.vsm.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document
@Data
@AllArgsConstructor
public class User {
	
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	private String phone_no;
	private String role;
	private Address address;

	
}
