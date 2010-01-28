package applet;

import database.DatabaseManager;

public class LoginInterface {
	private DatabaseManager manager;

	public LoginInterface() {
		this.manager = DatabaseManager.getInstance();
	}

	public AbstractInterface logIntoSystem(String login, String password) {
		if (manager.validatePassword(login, password)) {
			int userType = manager.getUserType(login);
			InterfaceBuilder builder;

			switch (userType) {
			case 0:
				builder = new AdminInterfaceBuilder(manager);
			case 1:
				builder = new ManagerInterfaceBuilder(manager);
			case 2:
				builder = new WorkerInterfaceBuilder(manager);
			default:
				builder = null;
				;
			}
			if (builder != null) {
				builder.buildMedia();
				builder.buildInterface();
				return builder.getBuiltInterface();
			}
		}
		return null;
	}
	
}
