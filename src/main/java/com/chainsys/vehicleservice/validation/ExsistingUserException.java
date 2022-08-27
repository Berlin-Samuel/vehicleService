package com.chainsys.vehicleservice.validation;

import java.util.List;
import com.chainsys.vehicleservice.model.UserDetails;

public class ExsistingUserException {
	public 	static void checkExistUser(List<UserDetails>userDetailsList,int userId) throws InvalidInputDataException {
		for(int i=0;i<userDetailsList.size();i++) {
			if(userDetailsList.get(i).getUserId()==userId)
				throw new InvalidInputDataException("User Already Exist");
		}
	}
}
