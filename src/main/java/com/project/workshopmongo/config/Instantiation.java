package com.project.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.project.workshopmongo.entities.User;
import com.project.workshopmongo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();

		User louis = new User(null, "Louis Brown", "louisbrown@gmail.com");
		User alex = new User(null, "Alex Andrews", "alexand99@gmail.com");
		User david = new User(null, "David Tenn", "davidtenn_2022@gmail.com");

		userRepository.saveAll(Arrays.asList(louis, alex, david));

	}

}
