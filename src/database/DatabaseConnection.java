package database;

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
		String obtainedPassword = null;

		// make query to database in order to obtain password for given login
		// if such a login does not exist return null
		return obtainedPassword;
	}

	public boolean validatePassword(String login, String password) {
		String obtainedPassword = this.getPassword(login);

		if (password.equals(obtainedPassword)) {
			return true;
		}
		return false;
	}

}
