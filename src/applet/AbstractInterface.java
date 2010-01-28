package applet;

import database.DatabaseManager;

public abstract class AbstractInterface {
	protected DatabaseManager manager;

	public AbstractInterface(DatabaseManager manager) {
		this.manager = manager;
	}

	public void start() {
	}

}
