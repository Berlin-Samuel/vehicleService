package com.chainsys.vehicleservice.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceCentre {
	@Id
	private int service_centre_id;
	private String centre_location;
	private long centre_phone_number;
	private String centre_email;
	private String centre_address;
	private String contact_person_name;
	private String contact_person_role;
	
	public int getService_centre_id() {
		return service_centre_id;
	}
	public void setService_centre_id(int service_centre_id) {
		this.service_centre_id = service_centre_id;
	}
	public String getCentre_location() {
		return centre_location;
	}
	public void setCentre_location(String centre_location) {
		this.centre_location = centre_location;
	}
	public long getCentre_phone_number() {
		return centre_phone_number;
	}
	public void setCentre_phone_number(long centre_phone_number) {
		this.centre_phone_number = centre_phone_number;
	}
	public String getCentre_email() {
		return centre_email;
	}
	public void setCentre_email(String centre_email) {
		this.centre_email = centre_email;
	}
	public String getCentre_address() {
		return centre_address;
	}
	public void setCentre_address(String centre_address) {
		this.centre_address = centre_address;
	}
	public String getContact_person_name() {
		return contact_person_name;
	}
	public void setContact_person_name(String contact_person_name) {
		this.contact_person_name = contact_person_name;
	}
	public String getContact_person_role() {
		return contact_person_role;
	}
	public void setContact_person_role(String contact_person_role) {
		this.contact_person_role = contact_person_role;
	}

}
