package com.chainsys.vehicleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.vehicleservice.pojo.ServiceCentre;
import com.chainsys.vehicleservice.repository.ServiceCentreRepository;

@Service
public class ServiceCentreService {
	@Autowired
	private ServiceCentreRepository servicecentrerepo;

	public List<ServiceCentre> getServiceCentre() {
		List<ServiceCentre> servicecentre = servicecentrerepo.findAll();
		return servicecentre;
	}

	public void deleteServiceCentrebyId(int id) {
		servicecentrerepo.deleteById(id);
	}

	public void addServiceCentre(ServiceCentre servicecentre) {
		servicecentrerepo.save(servicecentre);
	}

	public ServiceCentre findServiceCentrebyId(int id) {
		ServiceCentre servicecentreservice = servicecentrerepo.findById(id);
		return servicecentreservice;
	}
}
