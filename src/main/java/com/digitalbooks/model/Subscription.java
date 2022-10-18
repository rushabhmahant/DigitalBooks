package com.digitalbooks.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "subscription")
@SequenceGenerator(name = "subscriptionIdGenerator", sequenceName = "subscriptionIdGenerator",  initialValue = 100000)
public class Subscription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subscriptionIdGenerator")
	private Long subscriptionId;
	@Column(nullable = false)
	private Character subscriptionStatus = 'A';	// Subscription status set to Active by default
	@Column(nullable = false)
	private LocalDate subscriptionDate;
	@Column(nullable = false)
	private Double subscriptionPrice;
	
	@ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
	private User subscriptionUser;
	
	@ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
	private Book subscriptionBook;
	
	public Subscription() {
		// Default constructor
	}

	public Character getSubscriptionStatus() {
		return subscriptionStatus;
	}

	public void setSubscriptionStatus(Character subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}

	public LocalDate getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setSubscriptionDate(LocalDate subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	public Double getSubscriptionPrice() {
		return subscriptionPrice;
	}

	public void setSubscriptionPrice(Double subscriptionPrice) {
		this.subscriptionPrice = subscriptionPrice;
	}

	public Long getSubscriptionId() {
		return subscriptionId;
	}

	public User getSubscriptionUser() {
		return subscriptionUser;
	}

	public void setSubscriptionUser(User subscriptionUser) {
		this.subscriptionUser = subscriptionUser;
	}

	public Book getSubscriptionBook() {
		return subscriptionBook;
	}

	public void setSubscriptionBook(Book subscriptionBook) {
		this.subscriptionBook = subscriptionBook;
	}
	
	

}
