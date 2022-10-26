package com.project.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.workshopmongo.entities.User;
import com.project.workshopmongo.services.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {
 
	@Autowired
	UserService service;
	
	
	@GetMapping
	public ResponseEntity<List<User>> findAll (){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
