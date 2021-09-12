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
	
	@Test
	public void testEmail() {
		
		String email = "abc@bl.co.in";
		
		UserValidation userValidation = new UserValidation();
		
		boolean checkEmail = userValidation.checkEmail(email);
		
		Assert.assertEquals(true, checkEmail);
	}
	
	@Test
	public void testPhone() {
		
		String phone = "91 9965775758";
		
		UserValidation userValidation = new UserValidation();
		
		boolean checkPhone = userValidation.checkPhone(phone);
		
		Assert.assertEquals(true, checkPhone);
	}
	
	@Test
	public void testPassword() {
		
		String password = "hgfFH65@#hd";
		
		UserValidation userValidation = new UserValidation();
		
		boolean checkPassword =  userValidation.checkPassword(password);
		
		Assert.assertEquals(true, checkPassword);
	}

}
