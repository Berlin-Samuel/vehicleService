package com.chainsys.vehicleservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.vehicleservice.model.ServiceDetails;
import com.chainsys.vehicleservice.model.ServiceDetailsCompositeKey;
import com.chainsys.vehicleservice.repository.ServiceDetailsRepository;

@Service
public class ServiceOfServiceDetails {
	@Autowired
	private ServiceDetailsRepository serviceDetailsRepository;

	public List<ServiceDetails> getServiceDetails() {
		List<ServiceDetails> serviceDetails = serviceDetailsRepository.findAll();
		return serviceDetails;
	}

	public void deleteServiceDetailsbyId(ServiceDetailsCompositeKey id) {
		serviceDetailsRepository.deleteById(id);
	}

	public void addServiceDetails(ServiceDetails serviceDetails) {
		serviceDetailsRepository.save(serviceDetails);
	}

	public Optional<ServiceDetails> findServiceDetailsbyId(ServiceDetailsCompositeKey id) {
		Optional<ServiceDetails> serviceDetails = serviceDetailsRepository.findById(id);
		return serviceDetails;
	}
}
