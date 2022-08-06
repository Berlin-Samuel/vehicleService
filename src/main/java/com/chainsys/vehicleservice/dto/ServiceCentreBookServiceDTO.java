package com.chainsys.vehicleservice.dto;

import java.util.List;
import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.ServiceCentre;

public class ServiceCentreBookServiceDTO {
	private ServiceCentre serviceCentre;
	private List<BookService> bookService;

	public List<BookService> getBookService() {
		return bookService;
	}

	public void setBookService(List<BookService> bookService) {
		this.bookService = bookService;
	}

	public ServiceCentre getServiceCentre() {
		return serviceCentre;
	}

	public void setServiceCentre(ServiceCentre serviceCentre) {
		this.serviceCentre = serviceCentre;
	}

	

}
