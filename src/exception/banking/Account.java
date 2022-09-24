package exception.banking;

import java.util.Scanner;

import org.w3c.dom.NameList;

public class Account {
	String accountNum;
	String name;
	double balance;

	public Account() {
		super();
	}

	public Account(String accountNum, String name, double balance) throws AccountException {
		super();
		this.accountNum = accountNum;
		for (int i = 0; i <= name.length() - 1; i++) {
			if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
				throw new AccountException("Name not Valid");
			} else {

			}

			this.name = name;
		}
		if (balance >= 1000 && balance <= 5000) {
			this.balance = balance;
			throw new AccountException("Balance within the range");
		} else {
			throw new AccountException("Balance out of range");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account number");
		String accountNum = scanner.next();
		System.out.println("Enter name");
		String name = scanner.next();
		System.out.println("Enter balance");
		double balance = scanner.nextDouble();
		try {
			Account account = new Account(accountNum, name, balance);
		} catch (AccountException e) {
			System.out.println(e);
		}
	}

}
