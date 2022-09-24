package exception.question11;

import java.util.Scanner;

public class ClientBank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Bank account number");
		String accNum = scanner.next();
		System.out.println("Enter Account opening Balence");
		int bal = scanner.nextInt();
		BankDemo bDemo = new BankDemo(bal, accNum);
		while (true) {
			System.out.println("1)Balence Check");
			System.out.println("2)Diposit");
			System.out.println("3)Withdraw");
			System.out.println("4)Exit");
			switch (scanner.nextInt()) {
			case 1: {

				try {
					System.out.println("Enter account number");
					bDemo.checkBal(scanner.next());
				} catch (InsufficientFundsException e) {
					System.out.println(e);
				} finally {
					break;
				}
			}
			case 2: {
				try {
					System.out.println("Enter amount");
					bDemo.diposit(scanner.nextDouble());
				} catch (InsufficientFundsException e) {
					System.out.println(e);
				} finally {
					break;
				}
			}
			case 3: {
				try {
					System.out.println("Enter amount");
					bDemo.withdraw(scanner.nextDouble());
				} catch (InsufficientFundsException e) {
					System.out.println(e);
				} finally {
					break;
				}
			}
			case 4: {
				System.out.println("Thank you for using this app..!");
				System.exit(0);
			}
			default: {
				System.out.println("Enter valid input..!");
				break;
			}
			}
		}
	}

}
