package com.chainsys.vehicleservice.dto;

import java.util.ArrayList;
import java.util.List;
import com.chainsys.vehicleservice.model.UserDetails;
import com.chainsys.vehicleservice.model.VehiclesType;

public class UserDetailsVehicleTypeDTO {
	private UserDetails userDetails;
	private List<VehiclesType> vehicleTypeList = new ArrayList<>();

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetailsVehicleTypeDTO) {
		this.userDetails = userDetailsVehicleTypeDTO;
	}

	public List<VehiclesType> getVehicleTypeList() {
		return vehicleTypeList;
	}

	public void addVehicleType(VehiclesType vehicleType) {
		vehicleTypeList.add(vehicleType);
		
	}
}
