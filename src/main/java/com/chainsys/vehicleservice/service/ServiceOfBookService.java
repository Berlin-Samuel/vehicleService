package com.chainsys.vehicleservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.vehicleservice.dto.BookServiceServiceDetailsDTO;
import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.ServiceDetails;
import com.chainsys.vehicleservice.repository.BookServiceRepository;
import com.chainsys.vehicleservice.repository.ServiceDetailsRepository;

@Service
public class ServiceOfBookService {
	@Autowired
	private BookServiceRepository bookServiceRepository;
	@Autowired
	private ServiceDetailsRepository serviceDetailsRepository;

	public List<BookService> getBookService() {
		return bookServiceRepository.findAll();
	}

	public void deleteBookServicebyId(int id) {
		bookServiceRepository.deleteById(id);
	}

	public void addBookService(BookService bookService) {
		bookServiceRepository.save(bookService);
	}

	public BookService findBookServicebyId(int id) {
		return bookServiceRepository.findById(id);
	}

	public BookServiceServiceDetailsDTO getBookServiceServiceDetails(int id) {
		BookService bookService= bookServiceRepository.findById(id);
		BookServiceServiceDetailsDTO dto= new BookServiceServiceDetailsDTO();
		dto.setBookService(bookService);
		List<ServiceDetails> serviceDetails=serviceDetailsRepository.findByBookingId(id);
		dto.setServiceDetails(serviceDetails);
		return dto;
	}
}