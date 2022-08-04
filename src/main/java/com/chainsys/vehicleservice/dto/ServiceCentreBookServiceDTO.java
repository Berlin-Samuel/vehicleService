package com.chainsys.vehicleservice.dto;

import java.util.List;

import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.ServiceCentre;

public class ServiceCentreBookServiceDTO {
	private ServiceCentre serviceCentre;
	private List<BookService> bookServiceList;

	public ServiceCentre getServiceCentre() {
		return serviceCentre;
	}

	public void setServiceCentre(ServiceCentre serviceCentre) {
		this.serviceCentre = serviceCentre;
	}

	public List<BookService> getBookService() {
		return bookServiceList;
	}

	public void addBookService(BookService bookService) {
		bookServiceList.add(bookService);
	}
}
