package com.chainsys.vehicleservice.dto;

import java.util.List;
import com.chainsys.vehicleservice.model.ServiceDetails;
import com.chainsys.vehicleservice.model.Services;

public class ServicesServiceDetailsDTO {
	private Services services;
	private List<ServiceDetails> serviceDetails;

	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	public List<ServiceDetails> getServiceDetails() {
		return serviceDetails;
	}

	public void setServiceDetails(List<ServiceDetails> serviceDetails) {
		this.serviceDetails = serviceDetails;
	}

}
