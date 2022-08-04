package com.chainsys.vehicleservice.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ServiceCentre {
	@Id
	@Column(name = "service_centre_id")
	private int serviceCentreId;
	@Column(name = "centre_location")
	private String centreLocation;
	@Column(name = "centre_phone_number")
	private long centrePhoneNumber;
	@Column(name = "centre_email")
	private String centreEmail;
	@Column(name = "centre_address")
	private String centreAddress;
	@Column(name = "contact_person_name")
	private String contactPersonName;
	@Column(name = "contact_person_role")
	private String contactPersonRole;

	@OneToMany(mappedBy = "bookService", fetch = FetchType.LAZY)
	private List<BookService> bookService;

	public List<BookService> getBookService() {
		return bookService;
	}

	public void setBookService(List<BookService> bookService) {
		this.bookService = bookService;
	}

	public int getServiceCentreId() {
		return serviceCentreId;
	}

	public void setServiceCentreId(int serviceCentreId) {
		this.serviceCentreId = serviceCentreId;
	}

	public String getCentreLocation() {
		return centreLocation;
	}

	public void setCentreLocation(String centreLocation) {
		this.centreLocation = centreLocation;
	}

	public long getCentrePhoneNumber() {
		return centrePhoneNumber;
	}

	public void setCentrePhoneNumber(long centrePhoneNumber) {
		this.centrePhoneNumber = centrePhoneNumber;
	}

	public String getCentreEmail() {
		return centreEmail;
	}

	public void setCentreEmail(String centreEmail) {
		this.centreEmail = centreEmail;
	}

	public String getCentreAddress() {
		return centreAddress;
	}

	public void setCentreAddress(String centreAddress) {
		this.centreAddress = centreAddress;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getContactPersonRole() {
		return contactPersonRole;
	}

	public void setContactPersonRole(String contactPersonRole) {
		this.contactPersonRole = contactPersonRole;
	}

}
