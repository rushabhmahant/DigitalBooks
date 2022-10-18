package com.digitalbooks.model;

import java.util.Date;
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
@Table(name = "book")
@SequenceGenerator(name = "bookIdGenerator", sequenceName = "bookIdGenerator",  initialValue = 1000)
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "bookIdGenerator")
	private Long bookId;
	@Column(nullable = false)
	private String bookTitle;
	@Column(nullable = false)
	private String bookCategory;
	@Column(nullable = false)
	private String bookAuthor;
	@Column(nullable = false)
	private Double bookPrice;
	@Column(nullable = false)
	private String bookLogo;
	@Column(nullable = false)
	private String bookContent;
	@Column(nullable = false)
	private String bookPublisher;
	@Column(nullable = false)
	private Date bookPublishedDate;
	@Column(nullable = false)
	private Character bookBlockedStatus = 'U';	// Book is unblocked by default
	
	@OneToMany(mappedBy = "subscriptionBook", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Subscription> bookSubscriptions = new HashSet<Subscription>();
	
	public Book() {
		//	Default constructor
	}

	public Long getBookId() {
		return bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookLogo() {
		return bookLogo;
	}

	public void setBookLogo(String bookLogo) {
		this.bookLogo = bookLogo;
	}

	public String getBookContent() {
		return bookContent;
	}

	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public Date getBookPublishedDate() {
		return bookPublishedDate;
	}

	public void setBookPublishedDate(Date bookPublishedDate) {
		this.bookPublishedDate = bookPublishedDate;
	}

	public Character getBookBlockedStatus() {
		return bookBlockedStatus;
	}

	public void setBookBlockedStatus(Character bookBlockedStatus) {
		this.bookBlockedStatus = bookBlockedStatus;
	}

	public Set<Subscription> getBookSubscriptions() {
		return bookSubscriptions;
	}

	public void setBookSubscriptions(Set<Subscription> bookSubscriptions) {
		this.bookSubscriptions = bookSubscriptions;
	}
	
	

}
