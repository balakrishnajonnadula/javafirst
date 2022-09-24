package exception.question7;

public class UserRegistration {
	String userName;
	String country;

	public UserRegistration() {
		super();
	}

	public UserRegistration(String userName, String country) throws InvalidCountryException {
		super();
		this.userName = userName;
		if (country.equalsIgnoreCase("india")) {
			this.country = country;
			System.out.println("User successfully regesterd..!");
		} else {
			throw new InvalidCountryException("User Outside India cannot be registered");
		}
	}

}
