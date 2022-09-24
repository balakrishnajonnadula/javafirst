package com.patterns;

public class Pattern17 {

	public static void main(String[] args) {
		int star = 1;
		int num = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= star; j++) {
				System.out.print(num++ + " ");
			}
			star++;
			System.out.println();
		}

	}

}
