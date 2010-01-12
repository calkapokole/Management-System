package database;

import model.*;

public class DatabaseConnection {
	private static DatabaseConnection connection;

	private DatabaseConnection() {
	}

	public static DatabaseConnection establishConnection() {
		if (DatabaseConnection.connection == null) {
			DatabaseConnection.connection = new DatabaseConnection();
		}
		return DatabaseConnection.connection;
	}

	private String getPassword(String login) {
		String obtainedPassword = "";

		// make query to database in order to obtain password for given login
		// if such a login does not exist return null
		return obtainedPassword;
	}

	// check whether given password is correct for given login
	public boolean validatePassword(String login, String password) {
		String obtainedPassword = this.getPassword(login);

		if (password.equals(obtainedPassword)) {
			return true;
		}
		return false;
	}
	
	// obtain user type from database; 0 - Admin, 1 - Manager, 2 - Worker
	public int getUserType(String login) {
		return 0;
	}
	
	// this 3 methods get from database info about user and return appropriate User object
	public Admin getAdmin(String login) {
		return new Admin();
	}
	
	public Manager getManager(String login) {
		return new Manager();
	}
	
	public Worker getWorker(String login) {
		return new Worker();
	}
		
}
