package com.digitalbooks.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbooks.model.Book;
import com.digitalbooks.model.Subscription;
import com.digitalbooks.model.User;
import com.digitalbooks.repository.SubscriptionRepository;

@Service
public class SubscriptionService {
	
	@Autowired
	private SubscriptionRepository subscriptionRepository;
	
	@Autowired
	private BookService bookService;
	
	public Subscription addSubscription(long bookId, User user) {
		Subscription newSubscription = new Subscription();
		Book subscribedBook = bookService.getBookById(bookId);
		newSubscription.setSubscriptionBook(subscribedBook);
		newSubscription.setSubscriptionDate(LocalDate.now());
		newSubscription.setSubscriptionPrice(subscribedBook.getBookPrice());
		newSubscription.setSubscriptionUser(user);
		return subscriptionRepository.save(newSubscription);
	}

}
