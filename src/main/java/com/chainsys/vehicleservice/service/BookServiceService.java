package com.chainsys.vehicleservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.repository.BookServiceRepository;

@Service
public class BookServiceService {
	@Autowired
	private BookServiceRepository bookservicerepo;

	public List<BookService> getBookService() {
		List<BookService> bookservice = bookservicerepo.findAll();
		return bookservice;
	}
	public void deleteBookServicebyId(int id) {
		bookservicerepo.deleteById(id);
	}

	public void addBookService(BookService bookservice) {
		bookservicerepo.save(bookservice);
	}

	public BookService findBookServicebyId(int id) {
		BookService bookservice = bookservicerepo.findById(id);
		return bookservice;
	}
}