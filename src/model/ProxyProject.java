package model;

import java.util.Date;

public class ProxyProject implements ProjectInterface {
	private String name;
	private Priority priority;
	private State state;
	private Date deadline;
	private RealProject project;

	// ...

	public ProxyProject() {
	}

	public String getName() {
		if (project == null) {
			return name;
		} else {
			return project.getName();
		}
	}

	public void setName(String name) {
		if (project == null) {
			this.name = name;
		} else {
			project.setName(name);
		}
	}

	public String getCompanyName() {
		if (project == null) {
			project = new RealProject(name, priority, state, deadline);
		}
		return project.getCompanyName();
	}

	public void setCompanyName(String companyName) {
		if (project == null) {
			project = new RealProject(name, priority, state, deadline);
		}
		project.setCompanyName(companyName);
	}

	public String getDescription() {
		if (project == null) {
			project = new RealProject(name, priority, state, deadline);
		}
		return project.getDescription();
	}

	public void setDescription(String description) {
		if (project == null) {
			project = new RealProject(name, priority, state, deadline);
		}
		project.setDescription(description);
	}

	public Priority getPriority() {
		if (project == null) {
			return priority;
		} else {
			return project.getPriority();
		}
	}

	public void setPriority(Priority priority) {
		if (project == null) {
			this.priority = priority;
		} else {
			project.setPriority(priority);
		}
	}

	public State getState() {
		if (project == null) {
			return this.state;
		} else {
			return project.getState();
		}
	}

	public void setState(State state) {
		if (project == null) {
			project = new RealProject(name, priority, state, deadline);
		}
		project.setState(state);
	}

	public void nextState() {
		if (project == null) {
			project = new RealProject(name, priority, state, deadline);
		}
		project.nextState();
	}

	public void prevState() {
		if (project == null) {
			project = new RealProject(name, priority, state, deadline);
		}
		project.prevState();
	}

	public Date getStartDate() {
		if (project == null) {
			project = new RealProject(name, priority, state, deadline);
		}
		return project.getStartDate();
	}

	public void setStartDate(Date startDate) {
		if (project == null) {
			project = new RealProject(name, priority, state, deadline);
		}
		project.setStartDate(startDate);
	}

	public Date getDeadline() {
		if (project == null) {
			return deadline;
		} else {
			return project.getDeadline();
		}
	}

	public void setDeadline(Date deadline) {
		if (project == null) {
			this.deadline = deadline;
		}
		project.setDeadline(deadline);
	}

	public Date getFinishDate() {
		if (project == null) {
			project = new RealProject(name, priority, state, deadline);
		}
		return project.getFinishDate();
	}

	public void setFinishDate(Date finishDate) {
		if (project == null) {
			project = new RealProject(name, priority, state, deadline);
		}
		project.setFinishDate(finishDate);
	}

	public boolean deadlineMissed() {
		if (project == null) {
			project = new RealProject(name, priority, state, deadline);
		}
		return project.deadlineMissed();
	}

}
