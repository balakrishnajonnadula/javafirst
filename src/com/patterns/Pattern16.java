package com.patterns;

public class Pattern16 {
	public static void main(String[] args) {
		int star = 1;
		for(int i = 1; i <= 5; i++) {
			int num = 5;
			for(int j = 1; j <= star; j++) {
				System.out.print(num--);
			}
			star++;
			System.out.println();
		}
	}
}
