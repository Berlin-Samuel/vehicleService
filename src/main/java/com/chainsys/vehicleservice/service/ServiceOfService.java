package com.chainsys.vehicleservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.vehicleservice.dto.ServicesServiceDetailsDTO;
import com.chainsys.vehicleservice.model.ServiceDetails;
import com.chainsys.vehicleservice.model.Services;
import com.chainsys.vehicleservice.repository.ServiceDetailsRepository;
import com.chainsys.vehicleservice.repository.ServiceRepository;

@Service
public class ServiceOfService {
	@Autowired
	private ServiceRepository serviceRepository;
	@Autowired
	private ServiceDetailsRepository serviceDetailsRepository;

	public List<Services> getService() {
		List<Services> services = serviceRepository.findAll();
		return services;
	}

	public void deleteServicebyId(int id) {
		serviceRepository.deleteById(id);
	}

	public void addService(Services services) {
		serviceRepository.save(services);
	}

	public Services findServicebyId(int id) {
		Services services = serviceRepository.findById(id);
		return services;
	}

	public ServicesServiceDetailsDTO getServicesServiceDetails(int user_id) {
		Services services = serviceRepository.findById(user_id);
		ServicesServiceDetailsDTO dto = new ServicesServiceDetailsDTO();
		dto.setServices(services);
		List<ServiceDetails> serviceDetails = serviceDetailsRepository.findByServiceDetailId(user_id);
		dto.setServiceDetails(serviceDetails);
		return dto;
	}
}