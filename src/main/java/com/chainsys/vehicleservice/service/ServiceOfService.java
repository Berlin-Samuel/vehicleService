package com.chainsys.vehicleservice.service;

import java.util.ArrayList;
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
		return serviceRepository.findAll();
	}

	public void deleteServicebyId(int id) {
		serviceRepository.deleteById(id);
	}

	public void addService(Services services) {
		serviceRepository.save(services);
	}

	public Services findServicebyId(int id) {
		return serviceRepository.findById(id);
	}
	public List<String> getServiceName(List<Integer>serviceDetailId){
		List<String> serviceName=new ArrayList<>();
		List<Services> services=serviceRepository.findAll();
		for(int i=0;i<serviceDetailId.size();i++) {
			for(int j=0;j<services.size();j++) {
				if(serviceDetailId.get(i)==services.get(j).getServiceDetailId()) {
					serviceName.add(services.get(j).getServiceType());
				}
			}
		}
		return serviceName;
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