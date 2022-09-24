package Math;

import java.util.Scanner;

public class WholeAndFractional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner Activated
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal Number : ");
		
		//value
		double value = sc.nextDouble();
		System.out.println("Decimal Number is : " + value);
		
		//Fractional value
		double fractional_part = value % 1;
		
		//integral value
		double integral_part = value - fractional_part;

		System.out.println("Intigral part : " + integral_part);
		System.out.println("Fractionl part : " + fractional_part);	
		
		//Scanner Close
		sc.close();
	}

}
