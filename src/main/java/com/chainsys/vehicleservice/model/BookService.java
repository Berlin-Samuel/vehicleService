 package com.chainsys.vehicleservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookService {
	@Id
	@Column(name = "booking_id")
	private int bookingId;
	@Column(name = "service_centre_id")
	private int serviceCentreId;
	@Column(name = "vehicle_reg_number")
	private String vehicleRegNumber;
	@Column(name = "user_id")
	private int userId;
	@Column(name = "service_date")
	private Date serviceDate;
	@Column(name = "return_date")
	private Date returnDate;
	@Column(name = "service_estimate_amount")
	private int serviceEstimateAmount;
	@Column(name = "actual_service_amount")
	private int actualServiceAmount;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getServiceCentreId() {
		return serviceCentreId;
	}

	public void setServiceCentreId(int serviceCentreId) {
		this.serviceCentreId = serviceCentreId;
	}

	public String getVehicleRegNumber() {
		return vehicleRegNumber;
	}

	public void setVehicleRegNumber(String vehicleRegNumber) {
		this.vehicleRegNumber = vehicleRegNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getServiceEstimateAmount() {
		return serviceEstimateAmount;
	}

	public void setServiceEstimateAmount(int serviceEstimateAmount) {
		this.serviceEstimateAmount = serviceEstimateAmount;
	}

	public int getActualServiceAmount() {
		return actualServiceAmount;
	}

	public void setActualServiceAmount(int actualServiceAmount) {
		this.actualServiceAmount = actualServiceAmount;
	}

}
