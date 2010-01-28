package applet;

import model.MediaSimple;
import database.DatabaseManager;

public class ManagerInterfaceBuilder extends InterfaceBuilder {
	MediaSimple m;
	
	public ManagerInterfaceBuilder(DatabaseManager manager) {
		super(manager);
	}

	protected void buildMedia() {
		this.m = new MediaSimple(this.manager);
	}

	protected void buildInterface() {
		this.i = new ManagerInterface(this.manager, this.m);
	}
}
