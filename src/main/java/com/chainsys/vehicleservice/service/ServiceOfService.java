package com.chainsys.vehicleservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.Services;
import com.chainsys.vehicleservice.repository.ServiceRepository;

@Service
public class ServiceOfService {
	@Autowired
	private ServiceRepository serviceRepository;
	
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
}