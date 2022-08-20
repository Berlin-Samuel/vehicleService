package com.chainsys.vehicleservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.vehicleservice.model.VehiclesType;

public interface VehicleTypeRepository extends CrudRepository<VehiclesType, String> {

	Optional<VehiclesType> findById(String id);

	VehiclesType save(VehiclesType vehicleType);

	void deleteById(String string);

	List<VehiclesType> findAll();
	
	List<VehiclesType> findByUserId(int user_id);
}
