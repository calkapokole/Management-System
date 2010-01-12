package model;

public class Worker extends User {
	public boolean status;

	public Worker() {
	}

	public Worker(int type, String firstName, String lastName, Date employed) {
		super(type, firstName, lastName, employed);
	}

	public boolean getStatus(String firstName, String lastName) {
		return status;
	}

}
