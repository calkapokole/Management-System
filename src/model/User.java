package model;

import java.util.Date;
import java.util.List;

public abstract class User implements Cloneable {
	protected int type;
	protected String login;
	protected String passHash;
	protected List<Permission> permissions;
	protected String firstName;
	protected String lastName;
	protected Date birthDate;
	protected Date dateEmployed;

	public User() {
	}

	public User(int type, String login, String passHash,
			List<Permission> permissions, String firstName, String lastName,
			Date birthDate, Date employed) {
		this.type = type;
		this.login = login;
		this.passHash = passHash;
		this.permissions = permissions;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.dateEmployed = employed;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getDateEmployed() {
		return dateEmployed;
	}

	public void setDateEmployed(Date dateEmployed) {
		this.dateEmployed = dateEmployed;
	}

	public int getType() {
		return type;
	}

	public String getLogin() {
		return login;
	}

	public String getPassHash() {
		return passHash;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public Object clone() {
		try {
			User userCopy = (User) super.clone();
			return userCopy;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

}
