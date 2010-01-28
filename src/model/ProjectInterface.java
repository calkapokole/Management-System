package model;

import java.util.Date;

public interface ProjectInterface {
	public String getName();

	public void setName(String name);

	public String getCompanyName();

	public void setCompanyName(String companyName);

	public String getDescription();

	public void setDescription(String description);

	public Priority getPriority();

	public void setPriority(Priority priority);

	public State getState();

	public void setState(State state);
	
	public void nextState();
	
	public void prevState();

	public Date getStartDate();

	public void setStartDate(Date startDate);

	public Date getDeadline();

	public void setDeadline(Date deadline);

	public Date getFinishDate();

	public void setFinishDate(Date finishDate);

	public boolean deadlineMissed();
	
}
