package com.chainsys.vehicleservice.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ServiceDetails {
	@Id
	private int service_detail_id;
	private int booking_id;
	private int service_charges;
	private Date service_date;
	
	public int getService_detail_id() {
		return service_detail_id;
	}
	public void setService_detail_id(int service_detail_id) {
		this.service_detail_id = service_detail_id;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getService_charges() {
		return service_charges;
	}
	public void setService_charges(int service_charges) {
		this.service_charges = service_charges;
	}
	public Date getService_date() {
		return service_date;
	}
	public void setService_date(Date service_date) {
		this.service_date = service_date;
	}

}
