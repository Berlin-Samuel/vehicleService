package com.chainsys.vehicleservice.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(ServiceDetailsCompositeKey.class)
@Table(name="service_details")
public class ServiceDetails {
	@Id
	@Column(name = "service_detail_id")
	private int serviceDetailId;
	@Id
	@Column(name = "booking_id")
	private int bookingId;
	@Column(name = "service_charges")
	private int serviceCharges;
	@Column(name = "service_date")
	private Date serviceDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_detail_id", insertable = false, updatable = false, nullable = false)
	private Services services;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "booking_id", insertable = false, updatable = false, nullable = false)
	private BookService bookService;
	
	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

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
