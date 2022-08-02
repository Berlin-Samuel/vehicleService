package com.chainsys.vehicleservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.vehicleservice.model.Services;
@Repository
public interface ServiceRepository extends CrudRepository<Services, Integer> {

	Services findById(int id);

	Services save(Services service);

	void deleteById(int id);

	List<Services> findAll();
}
