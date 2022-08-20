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
import com.chainsys.vehicleservice.dto.VehicleTypeBookServiceDTO;
import com.chainsys.vehicleservice.model.VehiclesType;
import com.chainsys.vehicleservice.service.VehicleTypeService;

@Controller
@RequestMapping("/vehicletype")
public class VehicleTypeController {
	@Autowired
	private VehicleTypeService vehicleTypeService;

	@GetMapping("/getvehicletypebyid")
	public String getVehicleTypeId(@RequestParam("id") String id, Model model) {
		Optional<VehiclesType> vehicleType = vehicleTypeService.findVehicleTypebyId(id);
		model.addAttribute("vehicletype", vehicleType);
		return "find-vehicletype-form";
	}

	@GetMapping("/addvehicletype")
	public String showVehicleType(@RequestParam("userId")int id,Model model) {
		VehiclesType vehicleType = new VehicleType();
		model.addAttribute("addvehicletype", vehicleType);
		vehicleType.setUserId(id);
		return "add-vehicletype-form";
	}

	@PostMapping("/addvehicle")
	public String addVehicleType(@ModelAttribute("addvehicletype") VehicleType vehicleType,Model model) {
		vehicleTypeService.addVehicleType(vehicleType);
		model.addAttribute("userId", vehicleType.getUserId());
		return "vehicletype";
	}

	@GetMapping("/updatevehicletype")
	public String showUpdateForm(@RequestParam("vehicleid") String id, Model model) {
		Optional<VehicleType> vehicleType = vehicleTypeService.findVehicleTypebyId(id);
		model.addAttribute("updatevehicletype", vehicleType);
		return "update-vehicletype-form";
	}

	@PostMapping("/updatevehicle")
	public String updateVehicleType(@ModelAttribute("updatevehicletype") VehicleType vehicleType) {
		vehicleTypeService.addVehicleType(vehicleType);
		return "redirect:/vehicletype/vehicletypelist";
	}

	@GetMapping("/deletevehicletype")
	public String deleteVehicleType(@RequestParam("userid") String id) {
		vehicleTypeService.deleteVehicleTypebyId(id);
		return "redirect:/vehicletype/vehicletypelist";
	}

	@GetMapping("/vehicletypelist")
	public String getAllVehicleType(Model model) {
		List<VehicleType> vehicleType = vehicleTypeService.getVehicleType();
		model.addAttribute("allvehicletype", vehicleType);
		return "list-vehicletype";
	}
	@GetMapping("/getvehicletypebookservice")
	public String getVehicleTypeBookService(@RequestParam("user_id") String id, Model model) {
		VehicleTypeBookServiceDTO dto = vehicleTypeService.getVehicleTypeBookService(id);
		model.addAttribute("getvehicletype", dto.getVehicleType());
		model.addAttribute("bookservicedetails", dto.getBookServiceList());
		return "vehicletype-bookservice";
	}
}
