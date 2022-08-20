package com.chainsys.vehicleservice.model;

import java.sql.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "book_service")
public class BookService {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "booking_id_ref")
	@SequenceGenerator(name = "booking_id_ref", sequenceName = "booking_id_ref", allocationSize = 1)
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", insertable = false, updatable = false, nullable = false)
	private UserDetails userdetails;

	public UserDetails getUserdetails() {
		return userdetails;
	}

	public void setUserdetails(UserDetails userdetails) {
		this.userdetails = userdetails;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_centre_id", insertable = false, updatable = false, nullable = false)
	private ServiceCentre serviceCentre;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehicle_reg_number", insertable = false, updatable = false, nullable = false)
	private VehiclesType vehicleType;

	@OneToMany(mappedBy = "bookService", fetch = FetchType.LAZY)
	private List<ServiceDetails> serviceDetails;

	@OneToOne(mappedBy = "bookService", fetch = FetchType.LAZY)
	private Payment payment;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<ServiceDetails> getServiceDetails() {
		return serviceDetails;
	}

	public void setServiceDetails(List<ServiceDetails> serviceDetails) {
		this.serviceDetails = serviceDetails;
	}

	public VehiclesType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehiclesType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public ServiceCentre getServiceCentre() {
		return serviceCentre;
	}

	public void setServiceCentre(ServiceCentre serviceCentre) {
		this.serviceCentre = serviceCentre;
	}

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

}
