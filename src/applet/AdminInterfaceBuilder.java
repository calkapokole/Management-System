package applet;

import model.MediaAdvanced;
import database.DatabaseManager;

public class AdminInterfaceBuilder extends InterfaceBuilder {
	MediaAdvanced m;
	
	public AdminInterfaceBuilder(DatabaseManager manager) {
		super(manager);
	}

	protected void buildMedia() {
		this.m = new MediaAdvanced(this.manager);
	}

	protected void buildInterface() {
		this.i = new AdminInterface(this.manager, this.m);
	}

}
