package com.bridgeLabz.UserRegistration;

public class InvalidUserDetailException extends Exception {
	
	enum ExceptionType {
		INVALID_FIRST_NAME, INVALID_SECOND_NAME, INVALID_EMAIL, INVALID_PHONE_NUMBER, INVALID_PASSWORD
	}	
	ExceptionType type;
	
	public InvalidUserDetailException(ExceptionType type, String message) {
		super (message);
		this.type = type;
	}

}
