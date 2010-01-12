package applet;

import database.*;
import model.*;

public class ManagerInterface extends MyInterface {
	private static final long serialVersionUID = 1L;
	private Manager manager;
	
	public ManagerInterface(DatabaseConnection connection, User manager) {
		super(connection);
		this.manager = (Manager)manager;
	}

}
