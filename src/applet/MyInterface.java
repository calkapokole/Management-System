package applet;

import javax.swing.JApplet;

import database.*;
import model.*;

public abstract class MyInterface extends JApplet {
	private static final long serialVersionUID = 1L;
	protected DatabaseConnection connection;

	public MyInterface(DatabaseConnection connection) {
		this.connection = connection;
	}

	public void logout() {
	};

}
