package com.digitalbooks.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscription")
public class Subscription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public String subscriptionId;
	public String subscriptionUserId;
	public int subscriptionBookId;
	public char subscriptionStatus;
	public Date subscriptionDate;
	public double subscriptionPrice;
	
	public Subscription() {
		// Default constructor
	}

	public String getSubscriptionUserId() {
		return subscriptionUserId;
	}

	public void setSubscriptionUserId(String subscriptionUserId) {
		this.subscriptionUserId = subscriptionUserId;
	}

	public int getSubscriptionBookId() {
		return subscriptionBookId;
	}

	public void setSubscriptionBookId(int subscriptionBookId) {
		this.subscriptionBookId = subscriptionBookId;
	}

	public char getSubscriptionStatus() {
		return subscriptionStatus;
	}

	public void setSubscriptionStatus(char subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}

	public Date getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	public double getSubscriptionPrice() {
		return subscriptionPrice;
	}

	public void setSubscriptionPrice(double subscriptionPrice) {
		this.subscriptionPrice = subscriptionPrice;
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}
	
	

}
