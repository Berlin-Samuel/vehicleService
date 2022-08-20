package com.chainsys.vehicleservice.dto;

import java.util.List;
import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.UserDetails;

public class UserDetailsBookServiceDTO {

	private UserDetails userDetails;
	private List<BookService> bookService;
	
	public List<BookService> getBookService() {
		return bookService;
	}
	public void setBookService(List<BookService> bookService) {
		this.bookService = bookService;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	
}
