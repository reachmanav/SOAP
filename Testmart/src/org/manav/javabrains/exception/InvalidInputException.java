package org.manav.javabrains.exception;

public class InvalidInputException extends Exception {

	private String errorDetails;
	
	public InvalidInputException(String reason, String errorDetails)  {
		super(reason);
		this.errorDetails = errorDetails;
	}
	
	public String getFaultInfo()  {
		return errorDetails;
	}
	
}
