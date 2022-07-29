package com.chainsys.vehicleservice.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Payment {
	@Id
	private int bill_number;
	private int booking_id;
	private int bill_amount;
	private Date bill_date;
	
	public int getBill_number() {
		return bill_number;
	}
	public void setBill_number(int bill_number) {
		this.bill_number = bill_number;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getBill_amount() {
		return bill_amount;
	}
	public void setBill_amount(int bill_amount) {
		this.bill_amount = bill_amount;
	}
	public Date getBill_date() {
		return bill_date;
	}
	public void setBill_date(Date bill_date) {
		this.bill_date = bill_date;
	}
	
}
