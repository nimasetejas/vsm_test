package com.veronica.vsm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.veronica.vsm.modal.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
	

}
