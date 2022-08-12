package com.chainsys.vehicleservice.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="user_details")
public class UserDetails {
	@Id
	@Column(name = "user_id")
	/////@Range
	 //@Size(max=8,min=1, message="User Id must be in Number within rage of 1 to 8")
     //@NotBlank(message="*User Id is required")
	private int userId;
	@Column(name = "user_name")
	//@Size(max = 20, min = 3, message = "*UserName length should be 3 to 20")
	//@NotBlank(message = "*Name can't be Empty")
	//@Pattern(regexp = "^[A-Za-z]\\w{3,20}$", message = "*Enter Valid Name ")
	private String userName;

	@Column(name = "aadhar_number")
	//@NotBlank(message = "*Aadhar Number is required")
	//@Digits(message = "*Invalid Number", integer = 12, fraction = 0)
	private long aadharNumber;

	@Column(name = "mobile_number")
	//@NotBlank(message = "*Mobile Number is required")
	//@Digits(message = "*Invalid Number", integer = 10, fraction = 0)
	private long mobileNumber;

	@Column(name = "user_email")
	//@Email(message = "*Invalid Email")
	//@NotEmpty(message = "*Please enter email")
	private String userEmail;

	@Column(name = "user_password")
	//@NotBlank(message = "*Password is required")
	//@Size(max = 20, min = 8)
	//@Pattern(regexp = "^[A-Za-z]\\w{8,20}$", message = "*Password length should be 8 to 20")
	private String userPassword;

	@OneToMany(mappedBy = "userDetails", fetch = FetchType.LAZY)
	private List<VehicleType> vehicleTypeList;

	public List<VehicleType> getVehicleTypeList() {
		return vehicleTypeList;
	}

	public void setVehicleTypeList(List<VehicleType> vehicleTypeList) {
		this.vehicleTypeList = vehicleTypeList;
	}

	@OneToMany(mappedBy ="userdetails", fetch = FetchType.LAZY)
	private List<BookService> bookService;

	

	public List<BookService> getBookService() {
		return bookService;
	}

	public void setBookService(List<BookService> bookService) {
		this.bookService = bookService;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
