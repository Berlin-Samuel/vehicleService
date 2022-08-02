package com.chainsys.vehicleservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Services")
public class Services {
	@Id
	@Column(name = "service_detail_id")
	private int serviceDetailId;
	@Column(name = "service_type")
	private String serviceType;
	@Column(name = "service_charge")
	private int serviceCharge;
	@Column(name = "service_description")
	private String serviceDescription;

	public int getServiceDetailId() {
		return serviceDetailId;
	}

	public void setServiceDetailId(int serviceDetailId) {
		this.serviceDetailId = serviceDetailId;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public int getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(int serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

}
