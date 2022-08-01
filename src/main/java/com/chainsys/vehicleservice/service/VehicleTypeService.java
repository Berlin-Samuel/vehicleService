package com.chainsys.vehicleservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.vehicleservice.model.VehicleType;
import com.chainsys.vehicleservice.repository.VehicleTypeRepository;

@Service
public class VehicleTypeService {
	@Autowired
	private VehicleTypeRepository vehicletyperepo;

	public List<VehicleType> getVehicleType() {
		List<VehicleType> vehicletype = vehicletyperepo.findAll();
		return vehicletype;
	}

	public void deleteVehicleTypebyId(String id) {
		vehicletyperepo.deleteById(id);
	}

	public void addVehicleType(VehicleType vehicletype) {
		vehicletyperepo.save(vehicletype);
	}

	public Optional<VehicleType> findVehicleTypebyId(String id) {
		Optional<VehicleType> vehicletype = vehicletyperepo.findById(id);
		return vehicletype;
	}
}
