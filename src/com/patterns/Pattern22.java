package com.patterns;

public class Pattern22 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int n = (int) Math.pow(11, i - 1);
			for (int j = 0; j < 5; j++) {
				if (j < 5 - i) {
					System.out.print(" ");
				} else {
					System.out.print(space(n) + " ");
					break;
				}
			}
			System.out.println();
		}
	}

	static String space(int a) {
		String n1 = "";
		while (a > 0) {
			int rem = a % 10;
			n1 = rem + " " + n1;
			a = a / 10;
		}
		return n1;
	}

}
