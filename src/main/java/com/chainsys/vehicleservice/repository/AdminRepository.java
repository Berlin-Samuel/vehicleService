package com.chainsys.vehicleservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.vehicleservice.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
	Admin findByAdminEmailAndAdminPassword(String email, String password);
}