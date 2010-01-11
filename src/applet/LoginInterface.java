package applet;

import javax.swing.JApplet;

import database.*;


public class LoginInterface extends JApplet {
	private static final long serialVersionUID = 1L;
	private DatabaseConnection connection;

	public LoginInterface() {
		this.connection = DatabaseConnection.establishConnection();
	}

	public boolean login() {
		String login;
		String password;

		login = this.getLogin();
		password = this.getPassword();
		return connection.validatePassword(login, password);
	}

	private String getLogin() {
		String login = null;

		return login;
	}

	private String getPassword() {
		String password = null;

		return password;
	}

}
