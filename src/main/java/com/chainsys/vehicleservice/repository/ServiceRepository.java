package com.chainsys.vehicleservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.vehicleservice.pojo.Service;

public interface ServiceRepository extends CrudRepository<Service, Integer> {

	Service findById(int id);

	Service save(Service service);

	void deleteById(int id);

	List<Service> findAll();
}
