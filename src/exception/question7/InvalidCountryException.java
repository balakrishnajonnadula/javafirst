package exception.question7;

public class InvalidCountryException extends Exception {
	String message;

	public InvalidCountryException(String message) {
		super(message);
		this.message = message;
	}

}
