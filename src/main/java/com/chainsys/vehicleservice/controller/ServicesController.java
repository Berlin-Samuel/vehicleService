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
import com.chainsys.vehicleservice.dto.ServicesServiceDetailsDTO;
import com.chainsys.vehicleservice.model.Payment;
import com.chainsys.vehicleservice.model.Services;
import com.chainsys.vehicleservice.service.PaymentService;
import com.chainsys.vehicleservice.service.ServiceOfService;

@Controller
@RequestMapping("/vehicleservice")
public class ServicesController {
	@Autowired
	private ServiceOfService serviceOfService;
	@Autowired
	private PaymentService paymentService;
	@GetMapping("/getservicebyid")
	public String getServiceId(@RequestParam("id") int id, Model model) {
		Services services = serviceOfService.findServicebyId(id);
		model.addAttribute("vehicleservice", services);
		return "find-service-form";
	}

	@GetMapping("/addservices")
	public String showServiceForm(Model model) {
		Services services = new Services();
		Payment payment=new Payment();
		model.addAttribute("payment", payment);
		model.addAttribute("serviceadd", services);
		return "add-services-form";
	}

	@PostMapping("/addservice")
	public String addService(@ModelAttribute("serviceadd") Services services,@ModelAttribute("payment")Payment payment,Model model) {
		serviceOfService.addService(services);
		return "redirect:/vehiclepayment/addpayment";
	}

	@GetMapping("/updateservice")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		Services services = serviceOfService.findServicebyId(id);
		model.addAttribute("updateservice", services);
		return "update-service-form";
	}

	@PostMapping("/updateservices")
	public String updateService(@ModelAttribute("updateservice") Services services) {
		serviceOfService.addService(services);
		return "redirect:/vehicleservice/servicelist";
	}

	@GetMapping("/deleteservice")
	public String deleteService(@RequestParam("serviceid") int id) {
		serviceOfService.deleteServicebyId(id);
		return "redirect:/vehicleservice/servicelist";
	}

	@GetMapping("/servicelist")
	public String getAllService(Model model) {
		List<Services> services = serviceOfService.getService();
		model.addAttribute("allservice", services);
		return "list-service";
	}

	@GetMapping("/getservicesservicedetails")
	public String getServicesServiceDetails(@RequestParam("user_id") int id, Model model) {
		ServicesServiceDetailsDTO dto = serviceOfService.getServicesServiceDetails(id);
		model.addAttribute("getservices", dto.getServices());
		model.addAttribute("getservicedetails", dto.getServiceDetails());
		return "services-servicedetails";
	}
}