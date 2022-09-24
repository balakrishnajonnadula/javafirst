package com.patterns;

public class Pattern10 {

	public static void main(String[] args) {
		int space = 4;
		int star = 1;
		for (int i = 1; i <= 5; i++) {
			char temp =(char) ('F' - i);
			
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(temp++ + " ");
			}
			
			space--;
			star++;
			System.out.println();
		}

	}

}
