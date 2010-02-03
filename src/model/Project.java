package model;

import java.util.Date;

public abstract class Project {
	protected String name;
	protected String companyName;
	protected String description;
	protected Priority priority;
	protected StateContext state;
	protected Date startDate;
	protected Date deadline;
	protected Date finishDate;

	public Project() {
	}

	public Project(String name, Priority priority, State state, Date deadline) {
		// Missing data are loaded from database
		String companyName = "";
		String description = "";
		Date startDate = null;
		Date finishDate = null;

		this.name = name;
		this.companyName = companyName;
		this.description = description;
		this.priority = priority;
		this.startDate = startDate;
		this.deadline = deadline;
		this.state = new StateContext();
		this.state.setState(state);
		this.finishDate = finishDate;
	}

	public String getDetailedInfo() {
		return null;
	}

}
