package com.chainsys.vehicleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.chainsys.vehicleservice.model.Delivery;
import com.chainsys.vehicleservice.service.DeliveryService;

@Controller
@RequestMapping("/vehicledelivery")
public class DeliveryController {
	@Autowired
	private DeliveryService deliveryService;

	@GetMapping("/getvehicledeliverybyid")
	public String getVehicleDeliveryId(@RequestParam("id") int id, Model model) {
		Delivery delivery = deliveryService.findDeliverybyId(id);
		model.addAttribute("deliveryid", delivery);
		return "";
	}

	@GetMapping("/adddelivery")
	public String showDeliveryForm(@RequestParam("id") int id, Model model) {
		Delivery delivery = new Delivery();
		model.addAttribute("delivery", delivery);
		return "add-delivery-form";
	}

	@PostMapping("/adddeliveries")
	public String addDelivery(@ModelAttribute("adddelivery") Delivery delivery) {
		deliveryService.addDelivery(delivery);
		return "add-delivery-form";
	}

	@GetMapping("/updatedelivery")
	public String showUpdateForm(@RequestParam("updateid") int id, Model model) {
		Delivery delivery = deliveryService.findDeliverybyId(id);
		model.addAttribute("updatedelivery", delivery);
		return "";
	}

	@PostMapping("/updateuser")
	public String updateDelivery(@ModelAttribute("updatedelivery") Delivery delivery) {
		deliveryService.addDelivery(delivery);
		return "";
	}
	
	@GetMapping("/deletedelivery")
	public String deleteDelivery(@RequestParam("deliveryid") int id) {
		deliveryService.deleteDeliveryById(id);
		return "";
	}
}
