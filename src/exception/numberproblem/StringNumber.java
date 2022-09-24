package exception.numberproblem;

import java.util.Scanner;

public class StringNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String intiget");
		String str = scanner.next();
		try {
			int num = Integer.parseInt(str);
			int square = num * num;
			System.out.println("Square root of " + num + " = " + square);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage()+ " entered input isnot a valid format for an integer.");
		}

	}

}
