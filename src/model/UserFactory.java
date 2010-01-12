package model;

import database.*;

public class UserFactory {
	public User createUser(DatabaseConnection connection, String login) {
		switch (connection.getUserType(login)) {
		case 0:
			return connection.getAdmin(login);
		case 1:
			return connection.getManager(login);
		case 2:
			return connection.getWorker(login);
		default:
			return null;
		}
	}
	
}
