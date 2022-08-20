package com.chainsys.vehicleservice.dto;

import java.util.List;
import java.util.Optional;
import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.VehiclesType;

public class VehicleTypeBookServiceDTO {
	private Optional<VehiclesType> vehicleType;
	private List<BookService> bookServiceList;

	public Optional<VehiclesType> getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(Optional<VehiclesType> vehicleType) {
		this.vehicleType = vehicleType;
	}

	public List<BookService> getBookServiceList() {
		return bookServiceList;
	}

	public void setBookServiceList(List<BookService> bookServiceList) {
		this.bookServiceList = bookServiceList;
	}
}
