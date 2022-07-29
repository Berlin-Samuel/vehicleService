package com.chainsys.vehicleservice.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Service {
	@Id
	private int service_detail_id;
	private String service_type;
	private int service_charge;
	private String service_description;
	
	public int getService_detail_id() {
		return service_detail_id;
	}
	public void setService_detail_id(int service_detail_id) {
		this.service_detail_id = service_detail_id;
	}
	public String getService_type() {
		return service_type;
	}
	public void setService_type(String service_type) {
		this.service_type = service_type;
	}
	public int getService_charge() {
		return service_charge;
	}
	public void setService_charge(int service_charge) {
		this.service_charge = service_charge;
	}
	public String getService_description() {
		return service_description;
	}
	public void setService_description(String service_description) {
		this.service_description = service_description;
	}
	
}
