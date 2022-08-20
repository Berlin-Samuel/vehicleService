package com.chainsys.vehicleservice.dto;

import java.util.List;
import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.ServiceDetails;

public class BookServiceServiceDetailsDTO {
	private BookService bookService;
	private List<ServiceDetails> serviceDetails;

	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	public List<ServiceDetails> getServiceDetails() {
		return serviceDetails;
	}

	public void setServiceDetails(List<ServiceDetails> serviceDetails) {
		this.serviceDetails = serviceDetails;
	}

}
