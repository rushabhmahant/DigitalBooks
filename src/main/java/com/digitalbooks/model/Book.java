package com.digitalbooks.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int bookId;
	public String bookTitle;
	public String bookCategory;
	public String bookAuthor;
	public double bookPrice;
	public String bookLogo;
	public String bookContent;
	public String bookPublisher;
	public Date bookPublishedDate;
	public char bookBlockedStatus = 'U';	// Book is unblocked by default
	
	public Book() {
		//	Default constructor
	}

	public int getBookId() {
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

	public char getBookBlockedStatus() {
		return bookBlockedStatus;
	}

	public void setBookBlockedStatus(char bookBlockedStatus) {
		this.bookBlockedStatus = bookBlockedStatus;
	}
	
	

}
