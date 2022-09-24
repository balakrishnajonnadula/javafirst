package myPackage;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Radius of circle");
		double radius = scn.nextDouble();

		double perimeter = 2 * Math.PI * radius;

		double area = Math.PI * radius * radius;

		System.out.println("Primeter of the circle = " + perimeter);
		System.out.println("Area of the circle = " + area);

		scn.close();
	}

}
