package model;

import database.DatabaseManager;

public class MediaAdvanced extends Media {
	private WorkersIteratorAdvanced it;

	public MediaAdvanced(DatabaseManager manager) {
		super(manager);
	}
	
	public WorkersIteratorAdvanced getIterator(WorkerFilter filter) {
		super.getIterator(filter);
		it = new WorkersIteratorAdvanced(this);
		return it;
	}
}
