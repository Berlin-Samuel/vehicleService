package com.chainsys.vehicleservice.businesslogic;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import com.chainsys.vehicleservice.model.ServiceDetails;

public class Logic {
	public static Date getInstanceDate() {
		Calendar vcalendar = Calendar.getInstance();
		String dates = vcalendar.get(Calendar.DATE) + "/" + (vcalendar.get(Calendar.MONTH) + 1) + "/"
				+ vcalendar.get(Calendar.YEAR);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = new java.sql.Date(dateFormat.parse(dates).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static int getTotalServiceAmount(List<ServiceDetails> serviceDetails) {
		int totalAmount = 0;
		for (int i = 0; i < serviceDetails.size(); i++) {
			totalAmount += serviceDetails.get(i).getServiceCharges();
		}
		return totalAmount;
	}

	private Logic() {

	}
}
