package applet;

import model.MediaManager;
import model.ProgramistTask;
import model.Project;
import model.RealProject;
import model.TaskAbstract;
import model.TaskFactory;
import model.Worker;
import model.WorkerFilter;
import model.WorkersIteratorSimple;
import database.DatabaseManager;

public class ManagerInterface extends AbstractInterface {
	private MediaManager m;

	public ManagerInterface(DatabaseManager manager, MediaManager m) {
		super(manager);
		this.m = m;
	}

	public WorkersIteratorSimple getIteator(WorkerFilter filter) {
		return this.m.getIterator(filter);
	}

	public void addNewProject() {
		RealProject project = new RealProject();
		// write project info to database
	}

	public void alterProject(Project project, Project changes) {
		// rewrite data from changes to project
	}

	public void displayProjects() {
		// get info about project from database
	}

	public void displayProjectInfo(Project project) {
		project.getDetailedInfo();
	}

	public void displayWorkers(WorkerFilter filter) {
		WorkersIteratorSimple it = m.getIterator(filter);
		while (it.hasNext()) {
			it.getNext().toString();
		}
	}

	public void displayWorkerInfo(Worker worker) {
		worker.getDetailedInfo();
	}

	public ProgramistTask generateNewProgramistTask() {
		TaskFactory factory = m.getTaskFactory();
		return (ProgramistTask) factory.CreateProgramistTask();
	}

	public ProgramistTask generateNewAnalystTask() {
		TaskFactory factory = m.getTaskFactory();
		return (ProgramistTask) factory.CreateAnalystTask();
	}

	public void assignWorkerToProject() {
	}

	public void assignWorkerToTask(TaskAbstract task, Worker worker) {
		task.AssignWorker(worker);
	}

}
