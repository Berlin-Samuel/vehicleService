package com.chainsys.vehicleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.vehicleservice.businesslogic.Logic;
import com.chainsys.vehicleservice.dto.PaymentBookServiceDTO;
import com.chainsys.vehicleservice.model.BookService;
import com.chainsys.vehicleservice.model.Payment;
import com.chainsys.vehicleservice.model.ServiceDetails;
import com.chainsys.vehicleservice.repository.BookServiceRepository;
import com.chainsys.vehicleservice.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;

	public List<Payment> getPayment() {
		return paymentRepository.findAll();
	}

	@Autowired
	private BookServiceRepository bookServiceRepository;
	@Autowired
	private ServiceOfServiceDetails serviceOfServiceDetails;
	public void deletePaymentbyId(int id) {
		paymentRepository.deleteById(id);
	}

	public void addPayment(Payment payment) {
		payment.setBillDate(Logic.getInstanceDate());
		List<ServiceDetails>serviceDetails=serviceOfServiceDetails.getServiceDetailsByBookingId(payment.getBookingId());
		payment.setBillAmount(Logic.getTotalServiceAmount(serviceDetails));
		paymentRepository.save(payment);
	}

	public Payment findPaymentbyId(int id) {
		return paymentRepository.findById(id);
	}
	public Payment getBookService(int id) {
		return paymentRepository.findByBookingId(id);
	}
	public PaymentBookServiceDTO getPaymentBookService(int id) {
		Payment payment =paymentRepository.findByBookingId(id);
		PaymentBookServiceDTO dto = new PaymentBookServiceDTO();
		dto.setPayment(payment);
		BookService bookService = bookServiceRepository.findById(id);
		dto.setBookService(bookService);
		return dto;
	}
}
