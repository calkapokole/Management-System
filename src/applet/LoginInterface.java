package applet;

import javax.swing.JApplet;

import database.*;
import model.*;


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
		if (connection.validatePassword(login, password)) {
			UserFactory uFactory = new UserFactory();
			InterfaceFactory iFactory = new InterfaceFactory();
			
			iFactory.createInterface(connection, uFactory.createUser(connection, login));
			return true;
		}
		return false;
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
