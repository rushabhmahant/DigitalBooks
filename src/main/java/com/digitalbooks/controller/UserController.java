package com.digitalbooks.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbooks.model.Book;
import com.digitalbooks.model.Subscription;
import com.digitalbooks.model.User;
import com.digitalbooks.service.BookService;
import com.digitalbooks.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllUsers")
	public List<User> listUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/signup")
	public User userSignup(User user) {
		return userService.signUp(user);
	}
	
	

}
