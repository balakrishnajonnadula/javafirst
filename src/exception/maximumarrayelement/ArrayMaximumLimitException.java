package exception.maximumarrayelement;

public class ArrayMaximumLimitException extends Exception {
	String message;

	public ArrayMaximumLimitException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return "ArrayMaximumLimitException [message=" + message + "]";
	}

}
