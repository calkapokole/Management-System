package applet;

import database.*;
import model.*;

public class WorkerInterface extends MyInterface {
	private static final long serialVersionUID = 1L;
	private Worker worker;

	public WorkerInterface(DatabaseConnection connection, User worker) {
		super(connection);
		this.worker = (Worker)worker;
	}

}
