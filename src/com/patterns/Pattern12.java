package com.patterns;

public class Pattern12 {

	public static void main(String[] args) {
		int star = 1;
		int space = 4;
		int num = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= star; j++) {
				System.out.print(num + " ");
			}
			num++;
			space--;
			star++;
			System.out.println();
		}

	}

}
