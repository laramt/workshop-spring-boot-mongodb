package com.project.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.workshopmongo.dto.UserDTO;
import com.project.workshopmongo.entities.User;
import com.project.workshopmongo.services.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {
 
	@Autowired
	UserService service;
	
	// gets all users
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll (){
		List<User> list = service.findAll();
		// converting User to UserDTO
	    List<UserDTO> dto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(dto);
	}
	
	// gets one user
	@GetMapping("/{id}")
	public ResponseEntity<UserDTO> findById (@PathVariable String id){
		User user = service.findById(id);
		return ResponseEntity.ok().body(new UserDTO(user));
	}
}
