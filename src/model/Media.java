package model;

import java.util.ArrayList;
import database.DatabaseManager;

public abstract class Media {
	protected DatabaseManager manager;
	protected ArrayList<Worker> workers;
	
	public Media(DatabaseManager manager) {
		this.manager = manager;
	}
	
	public WorkersIterator getIterator(WorkerFilter filter) {
		fetchFilteredWorkers(filter);
		return null;
	}
	
	protected void fetchFilteredWorkers(WorkerFilter filter) {
	}
	
}
