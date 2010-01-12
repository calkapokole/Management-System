package applet;

import database.*;
import model.*;

public class AdminInterface extends MyInterface {
	private static final long serialVersionUID = 1L;
	private Admin user;
	
	public AdminInterface(DatabaseConnection connection, User admin) {
		super(connection);
		this.user = (Admin)admin;
	}

}
