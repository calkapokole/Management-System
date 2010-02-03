package applet;

import model.MediaManager;
import database.DatabaseManager;

public class ManagerInterfaceBuilder extends InterfaceBuilder {
	MediaManager m;
	
	public ManagerInterfaceBuilder(DatabaseManager manager) {
		super(manager);
	}

	protected void buildMedia() {
		this.m = new MediaManager(this.manager);
	}

	protected void buildInterface() {
		this.i = new ManagerInterface(this.manager, this.m);
	}
}
