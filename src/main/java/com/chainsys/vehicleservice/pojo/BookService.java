package com.chainsys.vehicleservice.pojo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class BookService {
	@Id
	private int	booking_id;
	private int service_centre_id;
	private String vehicle_reg_number;
	private int user_id;
	private Date service_date;
	private Date return_date;
	private int service_estimate_amount;
	private int actual_service_amount;

    public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getService_centre_id() {
		return service_centre_id;
	}
	public void setService_centre_id(int service_centre_id) {
		this.service_centre_id = service_centre_id;
	}
	public String getVehicle_reg_number() {
		return vehicle_reg_number;
	}
	public void setVehicle_reg_number(String vehicle_reg_number) {
		this.vehicle_reg_number = vehicle_reg_number;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getService_date() {
		return service_date;
	}
	public void setService_date(Date service_date) {
		this.service_date = service_date;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	public int getService_estimate_amount() {
		return service_estimate_amount;
	}
	public void setService_estimate_amount(int service_estimate_amount) {
		this.service_estimate_amount = service_estimate_amount;
	}
	public int getActual_service_amount() {
		return actual_service_amount;
	}
	public void setActual_service_amount(int actual_service_amount) {
		this.actual_service_amount = actual_service_amount;
	}
	
}
