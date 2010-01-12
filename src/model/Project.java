package model;

public class Project {
	private String name;
	private String companyName;
	private Date taken;
	private Date deadline;
	private String qualification;
	private int godzin; // Zakladany czas jaki trzeba bedzie poswiecic

	// na ten projekt na jednego pracownika

	public Project(String name, String companyName, Date taken, Date deadline) {
		this.name = name;
		this.companyName = companyName;
		this.taken = taken;
		this.deadline = deadline;
	}

	public String getName() {
		return this.name;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public Date whenTaken() {
		return this.taken;
	}

	public Date getDeadline() {
		return this.deadline;
	}

	public String getQualification() {
		return this.qualification;
	}

	public int getGodzin() {
		return this.godzin;
	}

	public boolean deadlineMissed(Date date) {
		if (date.getYear() > this.deadline.getYear()) {
			return true;
		}
		if (date.getYear() == this.deadline.getYear()) {
			if (date.getMonth() > this.deadline.getMonth()) {
				return true;
			}
			if (date.getMonth() == this.deadline.getMonth()) {
				if (date.getDay() > this.deadline.getDay()) {
					return true;
				}
			}
		}
		return false;
	}

}
