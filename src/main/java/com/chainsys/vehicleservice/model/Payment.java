package com.chainsys.vehicleservice.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "bill_number_ref")
	@SequenceGenerator(name = "bill_number_ref", sequenceName = "bill_number_ref", allocationSize = 1)
	@Column(name = "bill_number")
	private int billNumber;
	@Column(name = "booking_id")
	private int bookingId;
	@Column(name = "bill_amount")
	private int billAmount;
	@Column(name="payment_status")
	private String paymentStatus;
	@Column(name = "bill_date")
	private Date billDate;

	public int getBillNumber() {
		return billNumber;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "booking_id", nullable = false, insertable = false, updatable = false)
	private BookService bookService;

	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
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

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
}
