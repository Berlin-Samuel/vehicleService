package com.chainsys.vehicleservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.vehicleservice.pojo.UserDetails;
import com.chainsys.vehicleservice.repository.UserDetailsRepository;

@Service
public class UserDetailsService {
	@Autowired
	private UserDetailsRepository userdetailsrepo;

	public List<UserDetails> getUserDetails() {
		List<UserDetails> userdetails = userdetailsrepo.findAll();
		return userdetails;
	}

	public void deleteUserDetailsbyId(int id) {
		userdetailsrepo.deleteById(id);
	}

	public void addUserDetails(UserDetails userDetails) {
		userdetailsrepo.save(userDetails);
	}

	public UserDetails findUserDetailsbyId(int id) {
		UserDetails userdetailsservice = userdetailsrepo.findById(id);
		return userdetailsservice;
	}
}