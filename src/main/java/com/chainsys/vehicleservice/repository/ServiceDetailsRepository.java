package com.chainsys.vehicleservice.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.chainsys.vehicleservice.model.ServiceDetails;
import com.chainsys.vehicleservice.model.ServiceDetailsCompositeKey;

public interface ServiceDetailsRepository extends CrudRepository<ServiceDetails, ServiceDetailsCompositeKey>{

	Optional<ServiceDetails> findById(ServiceDetailsCompositeKey id);

	ServiceDetails save(ServiceDetails serviceDetails);

	void deleteById(ServiceDetailsCompositeKey id);

	List<ServiceDetails> findAll();
	
	List<ServiceDetails> findByServiceDetailId(int id);
	
	List<ServiceDetails> findByBookingId(int id);
	
}
