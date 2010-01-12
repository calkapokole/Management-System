package model;

public abstract class User {
	protected int type;
	protected String firstName;
	protected String lastName;
	protected Date employed;

	public User() {
	}

	public User(int type, String firstName, String lastName, Date employed) {
		this.type = type;
		this.firstName = firstName;
		this.lastName = lastName;
		this.employed = employed;
	}

	public int getUserType() {
		return this.type;
	}

	public Date getDateEmployed() {
		return this.employed;
	}

}
