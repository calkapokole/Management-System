package model;

import java.util.Date;
import java.util.List;

public abstract class TaskAbstract {
	private TaskExecutorInterface taskRunner;
	public int difficulty;
	public int priority;
	public List<Worker> workers;
	public Date startDate;
	public Date endDate;
	public TaskExecutorInterface imp;

	public void Execute() {
	}

	public void AssignWorker(Worker worker) {
	}

}
