package com.digitalbooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbooks.model.User;
import com.digitalbooks.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllUsers")
	public List<User> listUsers(){
		return userService.getAllUsers();
	} 

}
