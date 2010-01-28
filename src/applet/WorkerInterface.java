package applet;

import model.MediaSimple;
import model.WorkerFilter;
import model.WorkersIteratorSimple;
import database.DatabaseManager;

public class WorkerInterface extends AbstractInterface {
	private MediaSimple m;

	public WorkerInterface(DatabaseManager manager, MediaSimple m) {
		super(manager);
		this.m = m;
	}

	public WorkersIteratorSimple getIteator(WorkerFilter filter) {
		return this.m.getIterator(filter);
	}

	public void displayProjects() {
	}

	public void displayTasks() {
	}

}
