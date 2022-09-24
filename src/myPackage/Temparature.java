package myPackage;

import java.util.Scanner;

public class Temparature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Temparature in Fahrenheit");
		Float fahrenheit = sc.nextFloat();
		System.out.println("Enter Temparature is : " + fahrenheit + " Degrees Fahrenheit");
		System.out.println(
				fahrenheit + " degree Fahrenheit is equal to " + (fahrenheit - 32) * 5 / 9 + " degree in Celsius");
		sc.close();
	}

}
