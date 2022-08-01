package com.chainsys.vehicleservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Payment {
	@Id
	@Column(name="bill_number")
	private int billNumber;
	@Column(name="booking_id")
	private int bookingId;
	@Column(name="bill_amount")
	private int billAmount;
	@Column(name="bill_date")
	private Date billDate;
	public int getBillNumber() {
		return billNumber;
	}


	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public int getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}


	public Date getBillDate() {
		return billDate;
	}


	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	
	
}
