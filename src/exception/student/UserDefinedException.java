package exception.student;

public class UserDefinedException extends Exception {
	String message;

	public UserDefinedException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserDefinedException [message=" + message + "]";
	}

}
