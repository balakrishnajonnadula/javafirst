package exception.banking;

public class AccountException extends Exception {
	String message;

	public AccountException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return "AccountException [message=" + message + "]";
	}

}
