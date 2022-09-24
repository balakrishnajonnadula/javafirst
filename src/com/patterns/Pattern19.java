package com.patterns;

public class Pattern19 {

	public static void main(String[] args) {
		int star = 5;
		for (int i = 1; i <= 5; i++) {
			char ch = 'E';
			for (int j = 1; j <= star; j++) {
				System.out.print(ch-- + " ");
			}
			star--;
			System.out.println();
		}

	}

}
