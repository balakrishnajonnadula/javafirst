package com.alphabitpatterns;

public class Pattern14 {

	public static void main(String[] args) {
		int star = 1;
		for (int i = 1; i <= 6; i++) {
			char ch = 'A';
			for (int j = 1; j <= star; j++) {
				if (j < (star + 1) / 2)
					System.out.print(ch++);
				else {
					System.out.print(ch--);
				}
			}
			System.out.println();
			star += 2;
		}

	}

}
