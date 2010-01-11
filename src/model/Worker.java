package model;

public class Worker extends User {
	public boolean status;
	public Worker worker;
	public Worker(String firstName, String lastName, Date employed) {
		super(firstName, lastName, employed);
	}
	
	public Date getDateEmployed(String firstName, String lastName) {
		return this.employed;
	}
	
	public boolean getStatus(String firstName, String lastName) {
		return status;
	}
	
	public Worker getWorker() {
		return worker;
	}
	
	public void setWorker() {
		
	}
}
