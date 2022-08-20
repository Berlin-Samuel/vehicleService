package com.chainsys.vehicleservice.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.chainsys.vehicleservice.model.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
	
	Payment findById(int id);

	Payment save(Payment payment);

	void deleteById(int id);

	List<Payment> findAll();

	Payment findByBookingId(int id);
}
