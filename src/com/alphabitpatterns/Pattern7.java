package com.alphabitpatterns;

public class Pattern7 {
	public static void main(String[] args) {
		int star = 6;
		for(int i = 1; i <= 6; i++) {
			char ch = 'F';
			for(int j = 1; j <= star; j++) {
				System.out.print(ch--);
			}
			System.out.println();
			star--;
		}
	}
}
