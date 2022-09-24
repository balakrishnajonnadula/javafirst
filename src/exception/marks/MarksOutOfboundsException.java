package exception.marks;

public class MarksOutOfboundsException extends Exception {
	String message;

	public MarksOutOfboundsException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return "MarksOutOfboundsException [message=" + message + "]";
	}

}
