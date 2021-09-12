package com.bridgeLabz.userRegistration;

import org.junit.Test;

import com.bridgeLabz.UserRegistration.UserValidation;

import junit.framework.Assert;

public class UserRegistrationTest {
	
	@Test
	public void testFirstName() {
		
		String firstName = "Ajay";
		
		UserValidation userValidation = new UserValidation();
		
		boolean checkFirstName = userValidation.checkFirstName(firstName);
		
		Assert.assertEquals(true, checkFirstName);
	}
	
	@Test
	public void testLastName() {
		
		String secondName = "Barath";
		
		UserValidation userValidation = new UserValidation();
		
		boolean checkSecondName = userValidation.checkSecondName(secondName);
		
		Assert.assertEquals(true, checkSecondName);
	}

}
