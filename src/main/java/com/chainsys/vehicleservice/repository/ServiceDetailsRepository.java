package com.chainsys.vehicleservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.vehicleservice.pojo.ServiceDetails;

public interface ServiceDetailsRepository extends CrudRepository<ServiceDetails, Integer>{
	ServiceDetails findById(int id);

	ServiceDetails save(ServiceDetails serviceDetails);

	void deleteById(int id);

	List<ServiceDetails> findAll();
}
