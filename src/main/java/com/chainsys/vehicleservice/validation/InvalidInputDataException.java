package com.chainsys.vehicleservice.validation;

public class InvalidInputDataException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidInputDataException() {
		super("InValid Input Or Data Missing");
	}
	public InvalidInputDataException(String message) {
		super(message);
	}

}
