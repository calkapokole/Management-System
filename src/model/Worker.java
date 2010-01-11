package model;

public class Worker extends User {
	public Date dateZ;
	public boolean status;
	public Worker worker;
	public Worker(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public Date getDateZ(String firstName, String lastName) {
		return dateZ;
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
