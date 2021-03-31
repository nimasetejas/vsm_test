package com.veronica.vsm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.veronica.vsm.modal.Address;
import com.veronica.vsm.modal.User;
import com.veronica.vsm.repository.UserRepository;

@SpringBootApplication
public class VsmApplication implements CommandLineRunner {
	@Autowired
	UserRepository ur;

	public static void main(String[] args) {
		SpringApplication.run(VsmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		@Id
//		private int id;
//		private String name;
//		private String email;
//		private String password;
//		private String phone_no;
//		private String role;
//		private Address address;
		// TODO Auto-generated method stub
		List<User> usersList = new ArrayList<User>();
		User u1 = new User(10, "Ajit", "a@mail.com", "a123", "123", "customer",
				new Address(1, "602", "parkhe vasti", "susgaon", "pune", "411031"));
		User u2 = new User(20, "Shubham", "b@mail.com", "b123", "12342", "admin",
				new Address(2, "602", "parkhe vasti", "hadapsar", "pune", "411031"));
		User u3 = new User(30, "Somnath", "c@mail.com", "c123", "123234", "customer",
				new Address(3, "602", "parkhe vasti", "susgaon", "pune", "411031"));

		usersList.add(u1);
		usersList.add(u2);
		usersList.add(u3);
		ur.insert(usersList);
	}

}
//@Id
//private int id;
//private String flat_no;
//private String street;
//private String landmark;
//private String city;
//private String pincode;