package exception.question4;

public class MathOperationException extends Exception {
	String message;

	public MathOperationException(String message) {
		super(message);
		this.message = message;
	}

}
