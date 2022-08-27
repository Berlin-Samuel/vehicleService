package com.chainsys.vehicleservice.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.chainsys.vehicleservice.model.Delivery;

public interface DeliveryRepository extends CrudRepository<Delivery, Integer>{

	Delivery findById(int id);
	Delivery save(Delivery delivery);
	void deleteById(int id);
	List<Delivery> findAll();
	
}	
