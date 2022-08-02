package com.chainsys.vehicleservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.vehicleservice.model.UserDetails;
import com.chainsys.vehicleservice.repository.UserDetailsRepository;

@Service
public class UserDetailsService {
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	public List<UserDetails> getUserDetails() {
		List<UserDetails> userDetails = userDetailsRepository.findAll();
		return userDetails;
	}

	public void deleteUserDetailsbyId(int id) {
		userDetailsRepository.deleteById(id);
	}

	public void addUserDetails(UserDetails userDetails) {
		userDetailsRepository.save(userDetails);
	}

	public UserDetails findUserDetailsbyId(int id) {
		UserDetails userDetailsService = userDetailsRepository.findById(id);
		return userDetailsService;
	}
}