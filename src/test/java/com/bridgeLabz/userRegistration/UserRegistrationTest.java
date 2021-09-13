package com.bridgeLabz.userRegistration;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.bridgeLabz.UserRegistration.InvalidUserDetailException;
import com.bridgeLabz.UserRegistration.UserValidation;

import org.junit.Assert;

public class UserRegistrationTest {
	
	@Test
	public void testFirstName() throws InvalidUserDetailException {
		
		String firstName = "Ajay";
		
		UserValidation userValidation = new UserValidation();
		
		boolean checkFirstName = userValidation.checkFirstName(firstName);
		
		Assert.assertEquals(true, checkFirstName);
	}
	
	@Test
	public void testLastName() throws InvalidUserDetailException {
		
		String secondName = "Barath";
		
		UserValidation userValidation = new UserValidation();
		
		boolean checkSecondName = userValidation.checkSecondName(secondName);
			Assert.assertEquals(true, checkSecondName);

		
	}
	
	@Test
	public void testEmail() throws InvalidUserDetailException {
		
		String email = "abc@bl.co.in";
		
		UserValidation userValidation = new UserValidation();
		
		boolean checkEmail = userValidation.checkEmail(email);
		
		Assert.assertEquals(true, checkEmail);
	}
	
	@Test
	public void testPhone() throws InvalidUserDetailException {
		
		String phone = "91 9965775758";
		
		UserValidation userValidation = new UserValidation();
		
		boolean checkPhone = userValidation.checkPhone(phone);
		
		Assert.assertEquals(true, checkPhone);
	}
	
	@Test
	public void testPassword() throws InvalidUserDetailException {
		
		String password = "hgfFH65@#hd";
		
		UserValidation userValidation = new UserValidation();
		
		boolean checkPassword =  userValidation.checkPassword(password);
		
		Assert.assertEquals(true, checkPassword);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"abc.xyz@bl.co.in", "abc.xyz@bl.co",  "abc@bl.co", "abc@bl.co.in"})
	void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input) throws InvalidUserDetailException {
		UserValidation userValidation = new UserValidation();
		
		Assert.assertEquals(true,userValidation.checkEmail(input));
	}

}
