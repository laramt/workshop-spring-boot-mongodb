package com.project.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.workshopmongo.entities.User;
import com.project.workshopmongo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	// finds all users
	public List<User> findAll(){
		return repository.findAll();
	}
	
}
