package com.bridgeLabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {

	public static void main(String args[]) {
		System.out.println("Hello world");

		Scanner s = new Scanner(System.in);

		String firstName = s.nextLine();

		boolean checkFirstName = Pattern.matches("[A-Z][a-zA-Z]{3,}", firstName);

		System.out.println("First name check : " + checkFirstName);

		String secondName = s.nextLine();

		boolean checkSecondName = Pattern.matches("[A-Z][a-zA-Z]{3,}", secondName);

		System.out.println("Second name check : " + checkSecondName);

		String email = s.nextLine();

		boolean checkEmail = Pattern.matches("([a][b][c][.]?){1}([a-zA-Z]{3,})?[@]([b][l][.][c][o][.]?[i]?[n]?)",
				email);

		System.out.println("Email check : " + checkEmail);

		String phone = s.nextLine();

		boolean checkPhone = Pattern.matches("([9][1][ ])[0-9]{10}", phone);

		System.out.println("Phone number check : " + checkPhone);

		String password = s.nextLine();

		boolean rule1 = Pattern.matches("[a-zA-Z]{8,}", password);

		System.out.println("Rule 1 : " + rule1);

		boolean rule2 = Pattern.matches("(?=.*[A-Z]).+", password);

		System.out.println("Rule 2 : " + rule2);

	}
}
