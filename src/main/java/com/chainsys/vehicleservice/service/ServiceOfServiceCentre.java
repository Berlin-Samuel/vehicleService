package com.chainsys.vehicleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.vehicleservice.model.ServiceCentre;
import com.chainsys.vehicleservice.repository.ServiceCentreRepository;

@Service
public class ServiceOfServiceCentre {
	@Autowired
	private ServiceCentreRepository serviceCentreRepository;

	public List<ServiceCentre> getServiceCentre() {
		List<ServiceCentre> serviceCentre = serviceCentreRepository.findAll();
		return serviceCentre;
	}

	public void deleteServiceCentrebyId(int id) {
		serviceCentreRepository.deleteById(id);
	}

	public void addServiceCentre(ServiceCentre serviceCentre) {
		serviceCentreRepository.save(serviceCentre);
	}

	public ServiceCentre findServiceCentrebyId(int id) {
		ServiceCentre serviceCentre = serviceCentreRepository.findById(id);
		return serviceCentre;
	}
}
