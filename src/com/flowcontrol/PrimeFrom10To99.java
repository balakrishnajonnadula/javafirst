package com.flowcontrol;

public class PrimeFrom10To99 {

	public static void main(String[] args) {
		for (int num = 10; num <= 99; num++) {
			int count = 0;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(num + " ");
			}
		}

	}

}
