package applet;

import model.MediaSimple;
import model.WorkerFilter;
import model.WorkersIteratorSimple;
import database.DatabaseManager;

public class ManagerInterface extends AbstractInterface {
	private MediaSimple m;

	public ManagerInterface(DatabaseManager manager, MediaSimple m) {
		super(manager);
		this.m = m;
	}

	public WorkersIteratorSimple getIteator(WorkerFilter filter) {
		return this.m.getIterator(filter);
	}

	public void addNewProject() {
	}

	public void alterProject() {
	}

	public void displayProjects() {
	}

	public void displayProjectInfo() {
	}

	public void displayWorkers() {
	}

	public void displayWorkerInfo() {
	}

	public void assignWorkerToProject() {
	}

}
