package com.chainsys.vehicleservice.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class VehicleType {
	@Id
	private String vehicle_reg_number;
	private String vehicle_type;
	private String vehicle_color;
	private String vehicle_model;
	private Date vehicle_date_purchase;
	private Date vehicle_fc_date;
	private Date insurance_from;
	private Date insurance_to;
	private String insurance_company_name;
	private int user_id;
	
	public String getVehicle_reg_number() {
		return vehicle_reg_number;
	}
	public void setVehicle_reg_number(String vehicle_reg_number) {
		this.vehicle_reg_number = vehicle_reg_number;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public String getVehicle_color() {
		return vehicle_color;
	}
	public void setVehicle_color(String vehicle_color) {
		this.vehicle_color = vehicle_color;
	}
	public String getVehicle_model() {
		return vehicle_model;
	}
	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}
	public Date getVehicle_date_purchase() {
		return vehicle_date_purchase;
	}
	public void setVehicle_date_purchase(Date vehicle_date_purchase) {
		this.vehicle_date_purchase = vehicle_date_purchase;
	}
	public Date getVehicle_fc_date() {
		return vehicle_fc_date;
	}
	public void setVehicle_fc_date(Date vehicle_fc_date) {
		this.vehicle_fc_date = vehicle_fc_date;
	}
	public Date getInsurance_from() {
		return insurance_from;
	}
	public void setInsurance_from(Date insurance_from) {
		this.insurance_from = insurance_from;
	}
	public Date getInsurance_to() {
		return insurance_to;
	}
	public void setInsurance_to(Date insurance_to) {
		this.insurance_to = insurance_to;
	}
	public String getInsurance_company_name() {
		return insurance_company_name;
	}
	public void setInsurance_company_name(String insurance_company_name) {
		this.insurance_company_name = insurance_company_name;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}
