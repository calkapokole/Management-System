package applet;

import database.DatabaseManager;
import model.MediaAdvanced;
import model.WorkerFilter;
import model.WorkersIteratorAdvanced;

public class AdminInterface extends AbstractInterface {
	private MediaAdvanced m;

	public AdminInterface(DatabaseManager manager, MediaAdvanced m) {
		super(manager);
		this.m = m;
	}

	public WorkersIteratorAdvanced getIteator(WorkerFilter filter) {
		return this.m.getIterator(filter);
	}

	public void addWorker() {
	}

	public void alterWorker() {
	}

	public void removeWorker() {
	}

	public void addManager() {
	}

	public void alterManager() {
	}

	public void removeManager() {
	}

	public void displayWorkers() {
	}

	public void displayManagers() {
	}

}
