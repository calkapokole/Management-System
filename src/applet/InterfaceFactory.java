package applet;

import model.*;
import database.*;

public class InterfaceFactory {
	public MyInterface createInterface(DatabaseConnection connection, User user) {
		switch (user.getUserType()) {
			case 0: return new AdminInterface(connection, user);
			case 1: return new ManagerInterface(connection, user);
			case 2: return new WorkerInterface(connection, user);
			default: return null; 
		}
	}
}
