package com.chainsys.vehicleservice.dto;

import java.util.List;
import java.util.Optional;

import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.VehicleType;

public class VehicleTypeBookServiceDTO {
	private Optional<VehicleType> vehicleType;
	private List<BookService> bookServiceList;

	public Optional<VehicleType> getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(Optional<VehicleType> vehicleType) {
		this.vehicleType = vehicleType;
	}

	public List<BookService> getBookServiceList() {
		return bookServiceList;
	}

	public void setBookServiceList(List<BookService> bookServiceList) {
		this.bookServiceList = bookServiceList;
	}
}
