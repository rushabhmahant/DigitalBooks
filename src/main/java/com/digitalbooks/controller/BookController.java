package com.digitalbooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbooks.model.Book;
import com.digitalbooks.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/getAllBooks")
	public List<Book> listBooks(){
		return bookService.getAllBooks();
	}

}
