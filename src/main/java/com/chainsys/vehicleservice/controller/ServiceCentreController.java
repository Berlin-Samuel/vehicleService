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
import com.chainsys.vehicleservice.dto.ServiceCentreBookServiceDTO;
import com.chainsys.vehicleservice.model.ServiceCentre;
import com.chainsys.vehicleservice.service.ServiceOfServiceCentre;

@Controller
@RequestMapping("/vehicleservicecentre")
public class ServiceCentreController {
	private static final String SERVICECENTRE = "redirect:/vehicleservicecentre/servicecentrelist";
	@Autowired
	private ServiceOfServiceCentre serviceOfServiceCentre;

	@GetMapping("/getservicedetailbyid")
	public String getServiceCentreId(@RequestParam("id") int id, Model model) {
		ServiceCentre serviceCentre = serviceOfServiceCentre.findServiceCentrebyId(id);
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
		serviceOfServiceCentre.addServiceCentre(serviceCentre);
		return SERVICECENTRE;
	}

	@GetMapping("/updateservicecentre")
	public String showUpdateForm(@RequestParam("centreid") int id, Model model) {
		ServiceCentre serviceCentre = serviceOfServiceCentre.findServiceCentrebyId(id);
		model.addAttribute("updateservicecentre", serviceCentre);
		return "update-servicecentre-form";
	}

	@PostMapping("/updatecentre")
	public String updateServiceCentre(@ModelAttribute("updateservicecentre") ServiceCentre serviceCentre) {
		serviceOfServiceCentre.addServiceCentre(serviceCentre);
		return SERVICECENTRE;
	}

	@GetMapping("/deleteservicecentre")
	public String deleteServiceCentre(@RequestParam("userid") int id) {
		serviceOfServiceCentre.deleteServiceCentrebyId(id);
		return SERVICECENTRE;
	}

	@GetMapping("/servicecentrelist")
	public String getAllServiceCentre(Model model) {
		List<ServiceCentre> serviceCentre = serviceOfServiceCentre.getServiceCentre();
		model.addAttribute("allservicecentre", serviceCentre);
		return "list-servicecentre";
	}

	@GetMapping("/getservicecentrebookservice")
	public String getservicecentrebookservice(@RequestParam("user_id") int id, Model model) {
		ServiceCentreBookServiceDTO dto = serviceOfServiceCentre.getServiceCentreBookServiceDTO(id);
		model.addAttribute("getservicecentre", dto.getServiceCentre());
		model.addAttribute("bookservicecentre", dto.getBookService());
		return "servicecentre-bookservice";
	}
}
