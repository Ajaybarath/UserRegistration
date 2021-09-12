package com.bridgeLabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {

	public static void main(String args[]) {
		System.out.println("Hello world");

		Scanner s = new Scanner(System.in);

		String firstName = s.next();

		boolean checkFirstName = Pattern.matches("[A-Z][a-zA-Z]{3,}", firstName);

		System.out.println("First name check : " + checkFirstName);

		String secondName = s.next();

		boolean checkSecondName = Pattern.matches("[A-Z][a-zA-Z]{3,}", secondName);

		System.out.println("Second name check : " + checkSecondName);

	}
}
