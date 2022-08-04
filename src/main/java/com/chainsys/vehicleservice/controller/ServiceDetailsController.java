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
import com.chainsys.vehicleservice.model.ServiceDetails;
import com.chainsys.vehicleservice.model.ServiceDetailsCompositeKey;
import com.chainsys.vehicleservice.service.ServiceOfServiceDetails;

@Controller
@RequestMapping("/vehicleservicedetails")
public class ServiceDetailsController {
	@Autowired
	private ServiceOfServiceDetails serviceOfServiceDetails;

	@GetMapping("/getservicedetailbyid")
	public String getServiceDetailsId(@RequestParam("id") int id,@RequestParam("serviceid") int serviceid, Model model) {
		ServiceDetailsCompositeKey serviceDetailsCompositeKey=new ServiceDetailsCompositeKey(id,serviceid);
		Optional<ServiceDetails> serviceDetails = serviceOfServiceDetails.findServiceDetailsbyId(serviceDetailsCompositeKey);
		model.addAttribute("servicedetails", serviceDetails);
		return "find-servicedetails-form";
	}

	@GetMapping("/addservicedetails")
	public String showServiceDetails(Model model) {
		ServiceDetails serviceDetails = new ServiceDetails();
		model.addAttribute("addservicedetails", serviceDetails);
		return "add-servicedetails-form";
	}

	@PostMapping("/addservicedetail")
	public String addServiceDetails(@ModelAttribute("addservicedetails") ServiceDetails servicedetails) {
		serviceOfServiceDetails.addServiceDetails(servicedetails);
		return "redirect:/vehicleservicedetails/servicedetailslist";
	}

	@GetMapping("/updateservicedetail")
	public String showServiceDetailsForm(@RequestParam("id") int id,@RequestParam("serviceid") int serviceid, Model model) {
		ServiceDetailsCompositeKey serviceDetailsCompositeKey=new ServiceDetailsCompositeKey(id,serviceid);
		Optional<ServiceDetails> serviceDetails = serviceOfServiceDetails.findServiceDetailsbyId(serviceDetailsCompositeKey);
		model.addAttribute("updateservicedetail", serviceDetails);
		return "update-servicedetails-form";
	}

	@PostMapping("/updateservicedetails")
	public String updateServiceDetails(@ModelAttribute("updateservicedetail") ServiceDetails serviceDetails) {
		serviceOfServiceDetails.addServiceDetails(serviceDetails);
		return "redirect:/vehicleservicedetails/servicedetailslist";
	}

	@GetMapping("/deleteservicedetails")
	public String deleteServiceDetails(@RequestParam("userid") int id,@RequestParam("serviceid") int serviceid) {
		ServiceDetailsCompositeKey serviceDetailsCompositeKey=new ServiceDetailsCompositeKey(id,serviceid);
		serviceOfServiceDetails.deleteServiceDetailsbyId(serviceDetailsCompositeKey);
		return "redirect:/vehicleservicedetails/servicedetailslist";
	}

	@GetMapping("/servicedetailslist")
	public String getAllServiceDetails(Model model) {
		List<ServiceDetails> serviceDetails = serviceOfServiceDetails.getServiceDetails();
		model.addAttribute("allservicedetails", serviceDetails);
		return "list-servicedetails";
	}
}