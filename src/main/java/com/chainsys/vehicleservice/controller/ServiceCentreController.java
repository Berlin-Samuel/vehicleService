package com.chainsys.vehicleservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.vehicleservice.model.ServiceCentre;
import com.chainsys.vehicleservice.service.ServiceCentreService;
import com.chainsys.vehicleservice.service.UserDetailsService;

@Controller
@RequestMapping("/vehicleservice")
public class ServiceCentreController {
	@Autowired
	private ServiceCentreService servicecentreservice;

	@GetMapping("/getservicedetailbyid")
	public String getUserId(@RequestParam("id") int id, Model model) {
		ServiceCentre serviceCentre = servicecentreservice.findServiceCentrebyId(id);
		model.addAttribute("servicecentre", serviceCentre);
		return "find-servicecentre-form";
	}

	@GetMapping("/addservicecentre")
	public String showServiceCentre(Model model) {
		ServiceCentre serviceCentre = new ServiceCentre();
		model.addAttribute("addservicecentre", serviceCentre);
		return "add-servicecentre-form";
	}

	@PostMapping("/addcentre")
	public String addServiceCentre(@ModelAttribute("addservicecentre") ServiceCentre serviceCentre) {
		servicecentreservice.addServiceCentre(serviceCentre);
		return "redirect:/vehicleservice/servicecentrelist";
	}

	@GetMapping("/updateservicecentre")
	public String showUpdateForm(@RequestParam("centreid") int id, Model model) {
		ServiceCentre serviceCentre = servicecentreservice.findServiceCentrebyId(id);
		model.addAttribute("updateservicecentre", serviceCentre);
		return "update-servicecentre-form";
	}

	@PostMapping("/updatecentre")
	public String updateServiceCentre(@ModelAttribute("updateservicecentre") ServiceCentre serviceCentre) {
		servicecentreservice.addServiceCentre(serviceCentre);
		return "redirect:/vehicleservice/servicecentrelist";
	}

	@GetMapping("/deleteservicecentre")
	public String deleteServiceCentre(@RequestParam("userid") int id) {
		servicecentreservice.deleteServiceCentrebyId(id);
		return "redirect:/vehicleservice/servicecentrelist";
	}

	@GetMapping("/servicecentrelist")
	public String getAllServiceCentre(Model model) {
		List<ServiceCentre> serviceCentre = servicecentreservice.getServiceCentre();
		model.addAttribute("allservicecentre", serviceCentre);
		return "list-servicecentre";
	}
}
