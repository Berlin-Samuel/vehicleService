package com.chainsys.vehicleservice.model;

import java.io.Serializable;

public class ServiceDetailsCompositeKey implements Serializable{

		private int serviceDetailId;
		private int  bookingId;
		
		public int getServiceDetailId() {
			return serviceDetailId;
		}

		public void setServiceDetailId(int serviceDetailId) {
			this.serviceDetailId = serviceDetailId;
		}

		public int getBookingId() {
			return bookingId;
		}

		public void setBookingId(int bookingId) {
			this.bookingId = bookingId;
		}
		ServiceDetailsCompositeKey(){}
		public ServiceDetailsCompositeKey(int serviceDetailId,int  bookingId){
			this.serviceDetailId=serviceDetailId;
			this.bookingId=bookingId;
		}
}

