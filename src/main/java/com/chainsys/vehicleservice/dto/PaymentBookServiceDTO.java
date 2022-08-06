package com.chainsys.vehicleservice.dto;

import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.Payment;

public class PaymentBookServiceDTO {
	private Payment payment;
	private BookService bookService;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

}
