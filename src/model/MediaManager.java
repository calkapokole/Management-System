package model;

import database.DatabaseManager;

public class MediaManager extends Media {
	private WorkersIteratorSimple it;

	public MediaManager(DatabaseManager manager) {
		super(manager);
	}
	
	public WorkersIteratorSimple getIterator(WorkerFilter filter) {
		super.getIterator(filter);
		it = new WorkersIteratorSimple(this);
		return it;
	}
	
	public AdvancedProgramistTasksHandler getAdvancedTaskHandler() {
		return new AdvancedProgramistTasksHandler();
	}
	
	public BasicProgramistTasksHandler getBasicTaskHandler() {
		return new BasicProgramistTasksHandler();
	}
	
	public AnalystAsignmentHandler getAnalystTaskHandler() {
		return new AnalystAsignmentHandler();
	}
	
	public TaskFactory getTaskFactory() {
		return new TaskFactory();
	}

}
