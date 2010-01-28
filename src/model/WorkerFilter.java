package model;
public class WorkerFilter {
	public String firstName;
	public String lastName;
	public int age;
	public int practice;

	public WorkerFilter(String firstName, String lastName, int age, int practice) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.practice = practice;
	}

	public boolean compare(String firstName, String lastName, int aage,
			int practice) {
		if ((this.firstName == firstName) && (this.lastName == lastName)
				&& (this.age == age) && (this.practice == practice)) {
			return true;
		}
		return false;
	}

}
