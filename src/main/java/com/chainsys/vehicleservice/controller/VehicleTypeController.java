package com.chainsys.vehicleservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.vehicleservice.model.VehicleType;
import com.chainsys.vehicleservice.service.VehicleTypeService;

@Controller
@RequestMapping("/vehicleservice")
public class VehicleTypeController {
	@Autowired
	private VehicleTypeService vehicletypeservice;

	@GetMapping("/getvehicletypebyid")
	public String getVehicleTypeId(@RequestParam("id") String id, Model model) {
		Optional<VehicleType> vehicleType = vehicletypeservice.findVehicleTypebyId(id);
		model.addAttribute("vehicletype", vehicleType);
		return "find-vehicletype-form";
	}

	@GetMapping("/addvehicletype")
	public String showVehicleType(Model model) {
		VehicleType vehicleType = new VehicleType();
		model.addAttribute("addvehicletype", vehicleType);
		return "add-vehicletype-form";
	}

	@PostMapping("/addvehicle")
	public String addVehicleType(@ModelAttribute("addvehicletype") VehicleType vehicleType) {
		vehicletypeservice.addVehicleType(vehicleType);
		return "redirect:/vehicleservice/vehicletypelist";
	}

	@GetMapping("/updatevehicletype")
	public String showUpdateForm(@RequestParam("vehicleid") String id, Model model) {
		Optional<VehicleType> vehicleType = vehicletypeservice.findVehicleTypebyId(id);
		model.addAttribute("updatevehicletype", vehicleType);
		return "update-vehicletype-form";
	}

	@PostMapping("/updatevehicle")
	public String updateVehicleType(@ModelAttribute("updatevehicletype") VehicleType vehicleType) {
		vehicletypeservice.addVehicleType(vehicleType);
		return "redirect:/vehicleservice/vehicletypelist";
	}

	@GetMapping("/deletevehicletype")
	public String deleteVehicleType(@RequestParam("userid") String id) {
		vehicletypeservice.deleteVehicleTypebyId(id);
		return "redirect:/vehicleservice/vehicletypelist";
	}

	@GetMapping("/vehicletypelist")
	public String getAllVehicleType(Model model) {
		List<VehicleType> vehicleType = vehicletypeservice.getVehicleType();
		model.addAttribute("allvehicletype", vehicleType);
		return "list-vehicletype";
	}
}
