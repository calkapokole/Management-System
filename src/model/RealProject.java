package model;

import java.util.Calendar;
import java.util.Date;

public class RealProject extends Project implements ProjectInterface {
	public RealProject() {
	}

	public RealProject(String name, Priority priority, State state,
			Date deadline) {
		super(name, priority, state, deadline);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public State getState() {
		return state.getState();
	}

	public void setState(State state) {
		this.state.setState(state);
	}

	public void nextState() {
		state.next();
	}

	public void prevState() {
		state.prev();
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public boolean deadlineMissed() {
		if (this.deadline.after(Calendar.getInstance().getTime())) {
			return true;
		}
		return false;
	}

}
