package com.chainsys.vehicleservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.vehicleservice.model.UserDetails;
import com.chainsys.vehicleservice.model.VehicleType;

public class UserDetailsVehicleTypeDTO {
	private UserDetails userDetails;
	private List<VehicleType> vehicleTypeList = new ArrayList<VehicleType>();

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetailsVehicleTypeDTO) {
		this.userDetails = userDetailsVehicleTypeDTO;
	}

	public List<VehicleType> getVehicleTypeList() {
		return vehicleTypeList;
	}

	public void addVehicleType(VehicleType vehicleType) {
		vehicleTypeList.add(vehicleType);
		
	}
}
