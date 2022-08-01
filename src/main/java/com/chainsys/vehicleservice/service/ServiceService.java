package com.chainsys.vehicleservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.vehicleservice.repository.ServiceRepository;

@Service
public class ServiceService {
	@Autowired
	private ServiceRepository servicerepo;
	
	public List<Service> getService() {
		List<Service> service = servicerepo.findAll();
		return service;

}
}