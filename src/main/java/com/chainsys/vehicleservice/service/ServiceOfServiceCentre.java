package com.chainsys.vehicleservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.vehicleservice.dto.ServiceCentreBookServiceDTO;
import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.ServiceCentre;
import com.chainsys.vehicleservice.repository.BookServiceRepository;
import com.chainsys.vehicleservice.repository.ServiceCentreRepository;

@Service
public class ServiceOfServiceCentre {
	@Autowired
	private ServiceCentreRepository serviceCentreRepository;

	@Autowired
	private BookServiceRepository bookServiceRepository;

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
	public ServiceCentreBookServiceDTO getServiceCentreBookServiceDTO(int user_id) {
		ServiceCentre serviceCentre = serviceCentreRepository.findById(user_id);
		ServiceCentreBookServiceDTO dto = new ServiceCentreBookServiceDTO();
        dto.setServiceCentre(serviceCentre);
        List<BookService> bookServiceList = bookServiceRepository.findByServiceCentreServiceCentreId(user_id);
        dto.setBookService(bookServiceList);
        return dto;
    }
}
