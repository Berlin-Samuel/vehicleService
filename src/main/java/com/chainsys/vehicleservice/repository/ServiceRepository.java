package com.chainsys.vehicleservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.vehicleservice.model.Services;

public interface ServiceRepository extends CrudRepository<Services, Integer> {

	Services findById(int id);

	Services save(Services service);

	void deleteById(int id);

	List<Services> findAll();
}
