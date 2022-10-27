package com.project.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.workshopmongo.entities.User;
import com.project.workshopmongo.repositories.UserRepository;
import com.project.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	// finds all users
	public List<User> findAll(){
		return repository.findAll();
	}
	
	// finds user by id
	public User findById(String id) {
		Optional<User> user = repository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
}
