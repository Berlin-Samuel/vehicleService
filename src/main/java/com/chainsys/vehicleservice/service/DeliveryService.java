package com.chainsys.vehicleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.vehicleservice.model.Delivery;
import com.chainsys.vehicleservice.repository.DeliveryRepository;

@Service
public class DeliveryService {
	@Autowired
	private DeliveryRepository deliveryRepository;
	
	public List<Delivery> getDelivery(){
		return deliveryRepository.findAll();
	}
	public void deleteDeliveryById(int id) {
		deliveryRepository.deleteById(id);
	}
	public void addDelivery(Delivery delivery) {
		delivery.setDeliveryTime("04:00 pm");
		delivery.setDeliveryStatus("unDelivered");
		deliveryRepository.save(delivery);
		
	}
	public Delivery findDeliverybyId(int id) {
		return deliveryRepository.findById(id);
	}
}
