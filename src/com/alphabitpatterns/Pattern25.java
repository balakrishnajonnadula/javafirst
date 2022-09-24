package com.alphabitpatterns;

public class Pattern25 {

	public static void main(String[] args) {
		int star = 1;
		int count = 1;
		char ch = 'A';

		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				int reverse = star + count - 1;
				for (int j = 1; j <= star; j++) {
					System.out.print((char) (reverse + ch - 1));
					reverse--;
					count++;
				}
			} else {
				for (int j = 1; j <= star; j++) {
					System.out.print((char) (count + ch - 1));
					count++;
				}
			}
			System.out.println();
			star++;
		}

	}

}
