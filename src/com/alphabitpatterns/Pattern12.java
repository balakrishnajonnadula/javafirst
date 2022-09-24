package com.alphabitpatterns;

public class Pattern12 {

	public static void main(String[] args) {
		int star = 1;
		char ch = 'A';
		int num = 5;
		for (int i = 1; i <= 6; i++) {
			char temp = (char) (ch + num);
			char temp1 = (char) (temp + num);
			char temp2 = (char) (temp1 + num);
			char temp3 = (char) (temp2 + num);
			char temp4 = (char) (temp3 + num);

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
				if (j == 6) {
					System.out.print(temp4++);
				}
			}
			star++;
			System.out.println();
		}

	}

}
