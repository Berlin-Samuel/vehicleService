package com.chainsys.vehicleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.vehicleservice.model.Payment;
import com.chainsys.vehicleservice.model.ServiceCentre;
import com.chainsys.vehicleservice.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository paymentrepo;
	public List<Payment> getPayment() {
		List<Payment> payment = paymentrepo.findAll();
		return payment;
	}
	public void deletePaymentbyId(int id) {
		paymentrepo.deleteById(id);
	}
	public void addPayment(Payment payment) {
		paymentrepo.save(payment);
	}
	public Payment findPaymentbyId(int id) {
		Payment payment = paymentrepo.findById(id);
		return payment;
	}
}
