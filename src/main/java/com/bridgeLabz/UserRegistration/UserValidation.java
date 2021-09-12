package com.bridgeLabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.bridgeLabz.UserRegistration.InvalidUserDetailException.ExceptionType;

public class UserValidation {

	public static void main(String args[]) throws InvalidUserDetailException {
		System.out.println("Hello world");

		Scanner s = new Scanner(System.in);

		UserValidation userValidation = new UserValidation();

		String firstName = s.nextLine();

		boolean checkFirstName = userValidation.checkFirstName(firstName);
		System.out.println("First name check : " + checkFirstName);

		String secondName = s.nextLine();

		boolean checkSecondName = userValidation.checkSecondName(secondName);

		System.out.println("Second name check : " + checkSecondName);

		String email = s.nextLine();

		boolean checkEmail = userValidation.checkEmail(email);

		System.out.println("Email check : " + checkEmail);

		String phone = s.nextLine();

		boolean checkPhone = userValidation.checkPhone(phone);

		System.out.println("Phone number check : " + checkPhone);

		String password = s.nextLine();

		boolean checkPassword = userValidation.checkPassword(password);

	}

	public boolean checkFirstName(String detail) throws InvalidUserDetailException {
		boolean checkFirstName = Pattern.matches("[A-Z][a-zA-Z]{3,}", detail);

		if (checkFirstName != true) {
			throw new InvalidUserDetailException(ExceptionType.INVALID_FIRST_NAME, "Enter a valid first name");
		}

		return true;
	}

	public boolean checkSecondName(String detail) throws InvalidUserDetailException {
		boolean check = Pattern.matches("[A-Z][a-zA-Z]{3,}", detail);

		if (check != true) {
			throw new InvalidUserDetailException(ExceptionType.INVALID_FIRST_NAME, "Enter a valid second name");
		}

		return true;
	}

	public boolean checkEmail(String detail) {
		return Pattern.matches("([a][b][c][.]?){1}([a-zA-Z]{3,})?[@]([b][l][.][c][o][.]?[i]?[n]?)", detail);
	}

	public boolean checkPhone(String detail) {
		return Pattern.matches("([9][1][ ])[0-9]{10}", detail);
	}

	public boolean checkPassword(String password) {
		boolean rule1 = Pattern.matches(".{8,}", password);

		boolean rule2 = Pattern.matches("(?=.*[A-Z]).+", password);

		boolean rule3 = Pattern.matches("(?=.*\\d).+", password);

		boolean rule4 = Pattern.matches("(?=.*[.,:;\\'!@#$%^&*_+=|(){}]).+", password);

		return rule1 && rule2 && rule3 && rule4;

	}

}
