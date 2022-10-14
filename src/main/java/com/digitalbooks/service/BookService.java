package com.digitalbooks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbooks.model.Book;
import com.digitalbooks.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	public Book createBook(Book book) {
		return bookRepository.saveAndFlush(book);
	}
	
	public List<Book> searchBook(String category, String title, String author, Double price, String publisher) {
		
		return bookRepository.searchBook(category, title, author, price, publisher);
	}

	public void deleteBook(Integer id) {
		bookRepository.deleteById(id);
	}

}
