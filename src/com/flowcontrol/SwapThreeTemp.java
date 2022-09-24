package com.flowcontrol;

public class SwapThreeTemp {

	public static void main(String[] args) {
		int fNo = 10;
		int sNo = 20;
		int tNo = 30;
		int temp = fNo;

		System.out.println("Before swaping : " + fNo + "\t" + sNo + "\t" + tNo);
		fNo = sNo;
		sNo = tNo;
		tNo = temp;
		System.out.println("After swaping : " + fNo + "\t" + sNo + "\t" + tNo);

	}

}
