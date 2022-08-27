package com.chainsys.vehicleservice.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.chainsys.vehicleservice.businesslogic.Logic;
import com.chainsys.vehicleservice.dto.PaymentBookServiceDTO;
import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.Delivery;
import com.chainsys.vehicleservice.model.Payment;
import com.chainsys.vehicleservice.model.ServiceDetails;
import com.chainsys.vehicleservice.service.DeliveryService;
import com.chainsys.vehicleservice.service.PaymentService;
import com.chainsys.vehicleservice.service.ServiceOfBookService;
import com.chainsys.vehicleservice.service.ServiceOfServiceDetails;
import com.chainsys.vehicleservice.service.ServiceOfService;

@Controller
@RequestMapping("/vehiclepayment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	@Autowired
	private DeliveryService deliveryService;
	@Autowired
	private ServiceOfBookService serviceOfBookService;
	@Autowired
	private ServiceOfServiceDetails serviceOfServiceDetails;
	@Autowired
	private ServiceOfService serviceOfService;
	
	@GetMapping("/getpaymentdetailbyid")
	public String getPaymentId(@RequestParam("id") int id, Model model) {
		Payment payment = paymentService.getBookService(id);
		model.addAttribute("payment", payment);
		return "find-payment-form";
	}

	@GetMapping("/addpayment")
	public String showPayment(@RequestParam("id") int id,Model model) {
		Payment payment = new Payment();
		payment.setBookingId(id);
		paymentService.addPayment(payment);
		model.addAttribute("addpayment", payment);
		BookService bookService= serviceOfBookService.findBookServicebyId(id);
		Delivery delivery = new Delivery();
		delivery.setBookingId(id);
		delivery.setDeliveryDate(Logic.getDeliveryDate(bookService.getServiceDate()));
		deliveryService.addDelivery(delivery);
		model.addAttribute("delivery", delivery);
		List<ServiceDetails> serviceDetails = serviceOfServiceDetails.getServiceDetailsByBookingId(id);
		List<Integer> servicedetailid=serviceDetails.stream().map(ServiceDetails::getServiceDetailId).collect(Collectors.toList());
		List<String> serviceType=serviceOfService.getServiceName(servicedetailid);
		model.addAttribute("allservicedetails", serviceDetails);
		model.addAttribute("ServiceType", serviceType);
		return "find-payment-form";
	}
	@GetMapping("/paymentmessage")
	public String getpaymentMessage(@RequestParam("id")int billNo,Model model) {
		Payment payment =paymentService.findPaymentbyId(billNo);
		payment.setPaymentStatus("paid");
		paymentService.addPayment(payment);
		return "payment";
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

	@GetMapping("/getpaymentbookservice")
	public String getPaymentBookService(@RequestParam("userid") int id, Model model) {
		PaymentBookServiceDTO dto = paymentService.getPaymentBookService(id);
		model.addAttribute("getpayment", dto.getPayment());
		model.addAttribute("bookservicelist", dto.getBookService());
		return "payment-bookservice";
	}
}