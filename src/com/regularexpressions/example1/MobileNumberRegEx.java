package com.regularexpressions.example1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberRegEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * Regular expression for Mobile number is For 10 Digit number ==> [6-9][0-9]{9}
		 * --> 1st digit is 6 to 9, next nine numbers are 0 to 9 11 digit number ==> 0?
		 * [6-9][0-9]{9} --> Either 10 or 11 digits 12 digit number ==>
		 * (0|91)?[6-9][0-9]{9} --> Either 10 or 11 or 12
		 */
		while(true) {
			System.out.println("Enter mobile number..!");
			String phone = scanner.next();
			Pattern pattern = Pattern.compile("(0|91)?[6-9][0-9]{9}");
			Matcher matcher = pattern.matcher(phone);
			if (matcher.find() && matcher.group().equals(phone)) {
				System.out.println(args[0] + " Valid phone number");
				break;
			} else {
				System.out.println(args[0] + " invalid phone number");
			}
		}
	}

}
