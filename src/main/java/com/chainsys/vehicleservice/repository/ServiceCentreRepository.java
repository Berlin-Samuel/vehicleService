package com.chainsys.vehicleservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.vehicleservice.pojo.ServiceCentre;

public interface ServiceCentreRepository extends CrudRepository<ServiceCentre, Integer> {
	ServiceCentre findById(int id);

	ServiceCentre save(ServiceCentre serviceCentre);

	void deleteById(int id);

	List<ServiceCentre> findAll();
}
