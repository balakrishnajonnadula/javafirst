package myPackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;
		for (int i = 1; i <= n; i++) {
			LocalTime current = LocalTime.now();
			LocalDateTime td = LocalDateTime.now();
			System.out.println("Curent date and time is:" + current);
			System.out.println("Curent date and time is:" + td);
		}
		LocalDate today = LocalDate.now();
		System.out.println("Curent date and time is:" + today);
	}

}
