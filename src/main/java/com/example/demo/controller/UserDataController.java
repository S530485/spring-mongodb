package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserData;
import com.example.demo.repository.UserDataRepository;

import io.swagger.annotations.ApiOperation;

@RestController
public class UserDataController {

	@Autowired
	private UserDataRepository repository;

	@GetMapping("/")
	public String homePage() {
		return "Welcome to Spring Boot API";
	}

	@ApiOperation(value = "Adds the JSON object into the database")
	@PostMapping("/addData")
	public String saveUserData(@Valid @RequestBody UserData userData) {
			repository.save(userData);
			return "User Data Saved Successfully";

	}

	@GetMapping("/getData")
	public List<UserData> getData() {
		return repository.findAll();
	}

}
