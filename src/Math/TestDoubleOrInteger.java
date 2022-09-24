package Math;

import java.util.Scanner;

public class TestDoubleOrInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number either Fractional or integer");
		double num = sc.nextDouble();

		if ((num % 1) == 0) {
			System.out.println("Its not a Decimal Number " + num);
		} else {
			System.out.println("It's a Decimal Number " + num);
		}
		// Scanner close
		sc.close();
	}

}
