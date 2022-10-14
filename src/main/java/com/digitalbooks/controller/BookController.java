package com.digitalbooks.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping("/author/{authorId}/books")
	public Book createBook(@PathVariable String authorId, @RequestBody Book book) {
		return bookService.createBook(book);
	}
	
	@GetMapping("/search")
	public List<Book> searchBook(@RequestParam(required = false) String category,
			@RequestParam(required = false) String title,
			@RequestParam(required = false) String author,
			@RequestParam(required = false) Double price,
			@RequestParam(required = false) String publisher) {
		return bookService.searchBook(category, title, author, price, publisher);
	}
	
	@DeleteMapping("/delete/{authorId}/{id}")
	public void deleteBook(@PathVariable Integer id) {
		bookService.deleteBook(id);
	}

}
