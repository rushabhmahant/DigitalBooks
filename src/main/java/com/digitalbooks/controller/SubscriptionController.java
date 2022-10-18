package com.digitalbooks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbooks.model.Subscription;
import com.digitalbooks.model.User;
import com.digitalbooks.service.SubscriptionService;

@RestController
public class SubscriptionController {
	
	@Autowired
	private SubscriptionService subscriptionService;
	
	@PostMapping("/{bookId}/subscribe")
	public Subscription subscribe(@PathVariable long bookId, @RequestBody User user) {
		return subscriptionService.addSubscription(bookId, user);
	}

}
