package com.flowcontrol;

public class FiveValuesDivisibleBy235 {

	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		while ((i <= 1000) && (count < 5)) {
			if ((i % 2 == 0) && (i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i);
				count++;
			}
			i++;
		}
	}

}
