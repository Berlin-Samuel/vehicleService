package com.chainsys.vehicleservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.Services;
import com.chainsys.vehicleservice.repository.ServiceRepository;

@Service
public class ServiceService {
	@Autowired
	private ServiceRepository servicerepo;
	
	public List<Services> getService() {
		List<Services> service = servicerepo.findAll();
		return service;
}
	public void deleteServicebyId(int id) {
		servicerepo.deleteById(id);
	}
	public void addService(Services service) {
		servicerepo.save(service);
	}
	public Services findServicebyId(int id) {
		Services service = servicerepo.findById(id);
		return service;
	}
}