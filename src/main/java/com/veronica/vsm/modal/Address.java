package com.veronica.vsm.modal;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

	@Id
	private int id;
	private String flat_no;
	private String street;
	private String landmark;
	private String city;
	private String pincode;
	

}