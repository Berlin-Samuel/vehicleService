package com.chainsys.vehicleservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.vehicleservice.model.Admin;
import com.chainsys.vehicleservice.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository adminRepository;

	public Admin getAdminDetailsByNameAndPassword(String email, String password) {
		return adminRepository.findByAdminEmailAndAdminPassword(email, password);
	}
}