package model;

import database.DatabaseManager;

public class MediaSimple extends Media {
	private WorkersIteratorSimple it;

	public MediaSimple(DatabaseManager manager) {
		super(manager);
	}
	
	public WorkersIteratorSimple getIterator(WorkerFilter filter) {
		super.getIterator(filter);
		it = new WorkersIteratorSimple(this);
		return it;
	}

}
