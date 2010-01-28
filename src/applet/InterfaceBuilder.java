package applet;

import database.DatabaseManager;

public abstract class InterfaceBuilder {
	protected DatabaseManager manager;
	protected AbstractInterface i;

	public InterfaceBuilder(DatabaseManager manager) {
		this.manager = manager;
	}

	protected abstract void buildMedia();

	protected abstract void buildInterface();

	protected AbstractInterface getBuiltInterface() {
		return i;
	}

}
