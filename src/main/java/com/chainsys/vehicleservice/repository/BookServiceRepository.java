package com.chainsys.vehicleservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.vehicleservice.model.BookService;

public interface BookServiceRepository extends CrudRepository<BookService, Integer> {
	BookService findById(int id);

	BookService save(BookService bookService);

	void deleteById(int id);

	List<BookService> findAll();
	List<BookService> findByUserId(int user_id);

	List<BookService> findByServiceCentreServiceCentreId(int id);

	List<BookService> findByVehicleRegNumber(String id);


	
}
