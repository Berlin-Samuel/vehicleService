package com.chainsys.vehicleservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.repository.BookServiceRepository;

@Service
public class ServiceOfBookService {
	@Autowired
	private BookServiceRepository bookServiceRepository;

	public List<BookService> getBookService() {
		List<BookService> bookService = bookServiceRepository.findAll();
		return bookService;
	}
	public void deleteBookServicebyId(int id) {
		bookServiceRepository.deleteById(id);
	}

	public void addBookService(BookService bookService) {
		bookServiceRepository.save(bookService);
	}

	public BookService findBookServicebyId(int id) {
		BookService bookService = bookServiceRepository.findById(id);
		return bookService;
	}
}