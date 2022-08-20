package com.chainsys.vehicleservice.service;

import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chainsys.vehicleservice.dto.UserDetailsBookServiceDTO;
import com.chainsys.vehicleservice.dto.UserDetailsVehicleTypeDTO;
import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.UserDetails;
import com.chainsys.vehicleservice.model.VehiclesType;
import com.chainsys.vehicleservice.repository.BookServiceRepository;
import com.chainsys.vehicleservice.repository.UserDetailsRepository;
import com.chainsys.vehicleservice.repository.VehicleTypeRepository;

@Service
public class UserDetailsService {
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;

	@Autowired
	private BookServiceRepository bookServiceRepository;

	public List<UserDetails> getUserDetails() {
		return userDetailsRepository.findAll();
	}

	public void deleteUserDetailsbyId(int id) {
		userDetailsRepository.deleteById(id);
	}

	public void addUserDetails(UserDetails userDetails) {
		userDetailsRepository.save(userDetails);
	}

	public UserDetails findUserDetailsbyId(int id) {
		return userDetailsRepository.findById(id);
	}

	public UserDetailsVehicleTypeDTO getUserDetailsVehicleType(int user_id) {
		UserDetails userDetails = userDetailsRepository.findById(user_id);
		UserDetailsVehicleTypeDTO dto = new UserDetailsVehicleTypeDTO();
		dto.setUserDetails(userDetails);
		List<VehiclesType> vehicleTypeList = vehicleTypeRepository.findByUserId(user_id);
		Iterator<VehiclesType> iterator = vehicleTypeList.iterator();
		while (iterator.hasNext())
			dto.addVehicleType((VehiclesType) iterator.next());
		return dto;
	}

	public UserDetailsBookServiceDTO getUserDetailsBookService(int user_id) {
		UserDetails userDetails = userDetailsRepository.findById(user_id);
		UserDetailsBookServiceDTO dto = new UserDetailsBookServiceDTO();
		dto.setUserDetails(userDetails);
		List<BookService> bookService = bookServiceRepository.findByUserId(user_id);
		dto.setBookService(bookService);
		return dto;
	}

	public UserDetails getUserDetailsByNameAndPassword(String email, String password) {

		return userDetailsRepository.findByUserEmailAndUserPassword(email, password);
	}

}