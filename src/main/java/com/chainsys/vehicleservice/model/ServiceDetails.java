package com.chainsys.vehicleservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ServiceDetails {
	@Id
	@Column(name="service_detail_id")
	private int serviceDetailId;
	@Column(name="booking_id")
	private int  bookingId;
	@Column(name="service_charges")
	private int serviceCharges;
	@Column(name="service_date")
	private Date serviceDate;
	
	public int getServiceDetailId() {
		return serviceDetailId;
	}
	public void setServiceDetailId(int serviceDetailId) {
		this.serviceDetailId = serviceDetailId;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getServiceCharges() {
		return serviceCharges;
	}
	public void setServiceCharges(int serviceCharges) {
		this.serviceCharges = serviceCharges;
	}
	public Date getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}
	
}
