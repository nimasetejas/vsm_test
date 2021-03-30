package com.veronica.vsm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veronica.vsm.modal.User;
import com.veronica.vsm.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
public List<User> getAll(){
	return userRepository.findAll();
}
}
