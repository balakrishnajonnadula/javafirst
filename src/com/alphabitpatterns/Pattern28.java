package com.alphabitpatterns;

public class Pattern28 {

	public static void main(String[] args) {
		int star = 9;
		for (int i = 1; i <= 5; i++) {
			char ch = 'A';
			for (int j = 1; j <= star; j++) {
				if (j < (star + 1) / 2)
					System.out.print(ch++);
				else
					System.out.print(ch--);
			}
			star -= 2;
			System.out.println();
		}

	}

}
