package com.chainsys.vehicleservice.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class VehicleType {
	@Id
	@Column(name = "vehicle_reg_number")
	private String vehicleRegNumber;
	@Column(name = "vehicle_type")
	private String vehicleType;
	@Column(name = "vehicle_color")
	private String vehicleColor;
	@Column(name = "vehicle_model")
	private String vehicleModel;
	@Column(name = "vehicle_date_purchase")
	private Date vehicleDatePurchase;
	@Column(name = "vehicle_fc_date")
	private Date vehicleFcDate;
	@Column(name = "insurance_from")
	private Date insuranceFrom;
	@Column(name = "insurance_to")
	private Date insuranceTo;
	@Column(name = "insurance_company_name")
	private String insuranceCompanyName;
	@Column(name = "user_id")
	private int userId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
	private UserDetails userDetails;

	@OneToMany(mappedBy = "vehicleType", fetch = FetchType.LAZY)
	private List<BookService> bookService;

	public List<BookService> getBookService() {
		return bookService;
	}

	public void setBookService(List<BookService> bookService) {
		this.bookService = bookService;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public String getVehicleRegNumber() {
		return vehicleRegNumber;
	}

	public void setVehicleRegNumber(String vehicleRegNumber) {
		this.vehicleRegNumber = vehicleRegNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public Date getVehicleDatePurchase() {
		return vehicleDatePurchase;
	}

	public void setVehicleDatePurchase(Date vehicleDatePurchase) {
		this.vehicleDatePurchase = vehicleDatePurchase;
	}

	public Date getVehicleFcDate() {
		return vehicleFcDate;
	}

	public void setVehicleFcDate(Date vehicleFcDate) {
		this.vehicleFcDate = vehicleFcDate;
	}

	public Date getInsuranceFrom() {
		return insuranceFrom;
	}

	public void setInsuranceFrom(Date insuranceFrom) {
		this.insuranceFrom = insuranceFrom;
	}

	public Date getInsuranceTo() {
		return insuranceTo;
	}

	public void setInsuranceTo(Date insuranceTo) {
		this.insuranceTo = insuranceTo;
	}

	public String getInsuranceCompanyName() {
		return insuranceCompanyName;
	}

	public void setInsuranceCompanyName(String insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
