package myPackage;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/**
		 * int a = 10; int b = 50; System.out.println(a = b); System.out.println(50.0 >
		 * 50.0); System.out.println('a' > 45); System.out.println(23 < 24);
		 * System.out.println(23 != 24);
		 */
		System.out.println("Enter a single Charecter : ");
		char ch = scan.next().charAt(0);

		if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is a lowercase variable");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is a uppercase variable");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is a digit");
		} else {
			System.out.println(ch + " is a special character");
		}

		scan.close();
		run();
	}
	public static void run() {
		System.out.println("hello");
	}

}
