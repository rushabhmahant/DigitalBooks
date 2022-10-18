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
	
	public Book getBookById(Long bookId) {
		return bookRepository.findById(bookId).get();
	}
	
	public Book createBook(Book book) {
		return bookRepository.saveAndFlush(book);
	}
	
	public Book updateBook(Long bookId, Book book) {
		// book.setBookId(bookId);
		return bookRepository.saveAndFlush(book);
	}
	
	public List<Book> searchBook(String category, String title, String author, Double price, String publisher) {
		
		return bookRepository.searchBook(category, title, author, price, publisher);
	}

	public void deleteBook(Long bookId) {
		bookRepository.deleteById(bookId);
	}

	public Book setBookBlockedStatus(Long bookId, String block, Book book) {
		Character bookStatus = (block.equals("yes")) ? 'B' : 'U';
		if(!bookStatus.equals(book.getBookBlockedStatus())) {
			// book.setBookId(bookId);
			book.setBookBlockedStatus(bookStatus);
			bookRepository.save(book);
			if(bookStatus.equals('B')) {
				//	send notification to subscribed users subscribed to it
				book.getBookSubscriptions().stream()
					.forEach((sub) -> System.out.println(sub.getSubscriptionUser().getUserId()));
			}
		}
		return book;
	}

}
