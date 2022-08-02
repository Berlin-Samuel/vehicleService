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
import com.chainsys.vehicleservice.model.Payment;
import com.chainsys.vehicleservice.service.PaymentService;

@Controller
@RequestMapping("/vehiclepayment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	@GetMapping("/getpaymentdetailbyid")
	public String getPaymentId(@RequestParam("id") int id, Model model) {
		Payment payment = paymentService.findPaymentbyId(id);
		model.addAttribute("payment", payment);
		return "find-payment-form";
	}
	@GetMapping("/addpayment")
	public String showPayment(Model model) {
		Payment payment = new Payment();
		model.addAttribute("addpayment", payment);
		return "add-payment-form";
	}
	@PostMapping("/addpayments")
	public String addPayment(@ModelAttribute("addpayment") Payment payment) {
		paymentService.addPayment(payment);
		return "redirect:/vehiclepayment/paymentlist";
}
	@GetMapping("/updatepayment")
	public String showPaymentForm(@RequestParam("paymentid") int id, Model model) {
		Payment payment = paymentService.findPaymentbyId(id);
		model.addAttribute("updatepayment", payment);
		return "update-payment-form";
	}
	@PostMapping("/updatepayments")
	public String updatePayment(@ModelAttribute("updatepayment") Payment payment) {
		paymentService.addPayment(payment);
		return "redirect:/vehiclepayment/paymentlist";
	}
	@GetMapping("/deletepayment")
	public String deletePayment(@RequestParam("userid") int id) {
		paymentService.deletePaymentbyId(id);
		return "redirect:/vehiclepayment/paymentlist";
	}
	@GetMapping("/paymentlist")
	public String getAllPayment(Model model) {
		List<Payment> payment = paymentService.getPayment();
		model.addAttribute("allpayment", payment);
		return "list-payment";
	}
}