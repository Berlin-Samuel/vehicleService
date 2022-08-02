package com.chainsys.vehicleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.vehicleservice.model.Payment;
import com.chainsys.vehicleservice.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;
	public List<Payment> getPayment() {
		List<Payment> payment = paymentRepository.findAll();
		return payment;
	}
	public void deletePaymentbyId(int id) {
		paymentRepository.deleteById(id);
	}
	public void addPayment(Payment payment) {
		paymentRepository.save(payment);
	}
	public Payment findPaymentbyId(int id) {
		Payment payment = paymentRepository.findById(id);
		return payment;
	}
}
