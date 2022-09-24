package com.alphabitpatterns;

public class Pattern35 {

	public static void main(String[] args) {
		int rows = 5;
		char ch = 'A';
		int star = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= star; j++) {
				if (j % 2 == 0)
					System.out.print((char) (ch + j * rows - (j - 1) * j / 2 + star - j) + " ");
				else
					System.out.print((char) (ch + j * rows - (j - 1) * j / 2 + rows - 1 - star) + " ");
			}
			star++;
			System.out.println();
		}

	}

}
