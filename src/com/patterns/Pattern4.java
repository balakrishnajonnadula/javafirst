package com.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		int star = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= star; j++) {
				System.out.print(i);
			}
			star++;
			System.out.println();
		}

	}

}
