package com.chainsys.vehicleservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.vehicleservice.pojo.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails, Integer> {
	UserDetails findById(int id);

	UserDetails save(UserDetails userDetails);

	void deleteById(int id);

	List<UserDetails> findAll();
}
