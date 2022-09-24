package com.alphabitpatterns;

public class Pattern22 {

	public static void main(String[] args) {
		int star = 11;
		char ch = 'A';
		for (int i = 1; i <= 6; i++) {
			char temp = ch;
			for (int j = 1; j <= star; j++) {
				if (j > (star / 2))
					System.out.print(temp--);
				else
					System.out.print(temp++);
			}
			ch++;
			System.out.println();
			star -= 2;
		}

	}

}
