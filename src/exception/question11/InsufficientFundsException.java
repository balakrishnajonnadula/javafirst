package exception.question11;

public class InsufficientFundsException extends Exception {
	String message;

	public InsufficientFundsException(String message) {
		super(message);
		this.message = message;
	}

}
