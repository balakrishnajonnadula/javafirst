package com.alphabitpatterns;

public class Pattern32 {

	public static void main(String[] args) {

		int star = 1;
		char ch = 'A';
		int temp = (5 * (5 - 1)) / 2;

		for (int i = 1; i <= 4; i++) {
			temp = temp - i;
			for (int j = 1; j <= star; j++) {
				System.out.print((char) (ch + temp + j - 1));
			}
			star++;
			System.out.println();
		}
	}

}
