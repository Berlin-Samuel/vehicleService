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

import com.chainsys.vehicleservice.model.Services;
import com.chainsys.vehicleservice.service.ServiceService;

@Controller
@RequestMapping("/vehicleservice")
public class ServicesController {
	@Autowired
	private ServiceService serviceservice;
	
	@GetMapping("/getservicebyid")
	public String getServiceId(@RequestParam("id") int id, Model model) {
		Services serviceService = serviceservice.findServicebyId(id);
		model.addAttribute("serviceservice", serviceService);
		return "find-service-form";
	}
	@GetMapping("/addservices")
	public String showServiceForm(Model model) {
		Services serviceService = new Services();
		model.addAttribute("addservices", serviceService);
		return "add-services-form";
	}
	@PostMapping("/addservice")
	public String addService(@ModelAttribute("addservices") Services serviceService) {
		serviceservice.addService(serviceService);
		return "redirect:/vehicleservice/servicelist";
	}
	@GetMapping("/updateservice")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		Services serviceService = serviceservice.findServicebyId(id);
		model.addAttribute("updateservice", serviceService);
		return "update-service-form";
	}
	@PostMapping("/updateservices")
	public String updateService(@ModelAttribute("updateservice") Services servicesService) {
		serviceservice.addService(servicesService);
		return "redirect:/vehicleservice/servicelist";
	}
	@GetMapping("/deleteservice")
	public String deleteService(@RequestParam("serviceid") int id) {
		serviceservice.deleteServicebyId(id);
		return "redirect:/vehicleservice/servicelist";
	}
	@GetMapping("/servicelist")
	public String getAllService(Model model) {
		List<Services> serviceService = serviceservice.getService();
		model.addAttribute("allservice", serviceService);
		return "list-service";
	}
}
