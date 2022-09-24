package com.alphabitpatterns;

public class Pattern33 {

	public static void main(String[] args) {
		int star = 1;
		char ch = 'A';
		for (int i = 1; i <= 5; i++) {
			char temp = (char) (ch + 4);
			char temp1 = (char) (temp + 3);
			char temp2 = (char) (temp1 + 2);
			char temp3 = (char) (temp2 + 1);
			for (int j = 1; j <= star; j++) {
				if (j == 1) {
					System.out.print(ch++);
				}
				if (j == 2) {
					System.out.print(temp++);
				}
				if (j == 3) {
					System.out.print(temp1++);
				}
				if (j == 4) {
					System.out.print(temp2++);
				}
				if (j == 5) {
					System.out.print(temp3++);
				}
			}
			star++;
			System.out.println();
		}

	}

}
