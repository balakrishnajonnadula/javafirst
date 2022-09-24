package exception.question11;

import exception.numberproblem.StringNumber;

public class BankDemo {
	private String accNum;
	private double amount;

	public BankDemo() {
		super();
	}

	public BankDemo(double amount, String accNum) {
		super();
		this.amount = amount;
		this.accNum = accNum;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void diposit(double dipAmt) throws InsufficientFundsException {
		if (dipAmt > 1) {
			this.setAmount(getAmount() + dipAmt);
			System.out.println("Successfully diposited" + dipAmt);
		} else {
			throw new InsufficientFundsException("InvalidFundDeposit");
		}
	}

	public void withdraw(double withAmt) throws InsufficientFundsException {
		if (withAmt <= getAmount()) {
			this.setAmount(this.getAmount() - withAmt);
			System.out.println("Withdrawn succfull " + withAmt);
		} else {
			throw new InsufficientFundsException("InsufficientFunds");
		}
	}

	public void checkBal(String accountNum) throws InsufficientFundsException {
		if (this.getAccNum().equals(accountNum)) {
			System.out.println("Balence is : " + getAmount());
		} else {
			throw new InsufficientFundsException("InvalidAccountNumber");
		}
	}

}
