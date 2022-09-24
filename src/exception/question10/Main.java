package exception.question10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many leaves you want");
		try {
			LeaveSystem lSystem = new LeaveSystem(scanner.nextInt());
		} catch (LeaveQuotaExceededException e) {
			System.out.println(e);
		}
		System.out.println("Continue..!");
	}
}
