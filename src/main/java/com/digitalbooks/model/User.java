package com.digitalbooks.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@SequenceGenerator(name = "userIdGenerator", sequenceName = "userIdGenerator",  initialValue = 10000)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "userIdGenerator")
	private Long userId;
	@Column(nullable = false)
	private String userName;
	@Column(nullable = false)
	private String userPassword;
	@Column(nullable = false)
	private Character userAccountType;
	@Column(nullable = false)
	private String userFirstName;
	@Column(nullable = false)
	private String userLastName;
	
	@OneToMany(mappedBy = "subscriptionUser", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Subscription> userSubscriptions = new HashSet<Subscription>();
	
	public User() {
		// Default constructor
	}

	public Long getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Character getUserAccountType() {
		return userAccountType;
	}

	public void setUserAccountType(Character userAccountType) {
		this.userAccountType = userAccountType;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public Set<Subscription> getSubscriptions() {
		return userSubscriptions;
	}

	public void setSubscriptions(Set<Subscription> userSubscriptions) {
		this.userSubscriptions = userSubscriptions;
	}

}
