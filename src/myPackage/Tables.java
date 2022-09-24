package myPackage;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		
		//Activated the Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		// Get the value form Scanner
		int num = sc.nextInt();
 
		System.out.println("Seclected number : " + num);
		for (int i = 0; i < 10; i++) {
			System.out.println(num + " X " + (i + 1) + " = " + (num * (i + 1)));
		}

		sc.close();
	}

}
