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
	private VehicleTypeRepository vehicleTypeRepository;

	public List<VehicleType> getVehicleType() {
		List<VehicleType> vehicleType = vehicleTypeRepository.findAll();
		return vehicleType;
	}

	public void deleteVehicleTypebyId(String id) {
		vehicleTypeRepository.deleteById(id);
	}

	public void addVehicleType(VehicleType vehicleType) {
		vehicleTypeRepository.save(vehicleType);
	}

	public Optional<VehicleType> findVehicleTypebyId(String id) {
		Optional<VehicleType> vehicleType = vehicleTypeRepository.findById(id);
		return vehicleType;
	}
}
