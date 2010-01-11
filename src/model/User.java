package model;

public abstract class User {
	protected String firstName;
	protected String lastName;
	protected Date employed;

	public User(String firstName, String lastName, Date employed) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employed = employed;
	}

}
