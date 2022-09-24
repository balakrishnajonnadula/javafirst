package com.flowcontrol;

import java.util.Scanner;

public class FloydsFormat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number..!");
		int num = scanner.nextInt();
		int star = 1;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			star++;
			System.out.println();
		}

	}

}
