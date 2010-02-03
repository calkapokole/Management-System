package applet;

import database.DatabaseManager;
import model.Manager;
import model.MediaAdvanced;
import model.Users;
import model.Worker;
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
		Worker worker = Users.createWorker(null, null);
		// write worker to database
	}

	public void alterWorker(Worker worker, Worker changes) {
		// rewrite data from changes into worker
	}

	public void removeWorker(String login) {
		// remove worker of given login from database
	}

	public void addManager() {
		Manager manager = Users.createManager(null, null);
		// write manager to database
	}

	public void alterManager(Manager manager, Manager changes) {
		// rewrite data from changes into manager
	}

	public void removeManager(String login) {
		// remove manager of given login from database
	}

	public void displayWorkers(WorkerFilter filter) {
		WorkersIteratorAdvanced it = m.getIterator(filter);
		while (it.hasNext()) {
			it.getNext().toString();
		}
	}

	public void displayManagers() {
		// managers are only few so there is no need to filter them, just
		// displaying everyone
	}

}
