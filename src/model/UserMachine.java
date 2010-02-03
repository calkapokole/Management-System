package model;

public class UserMachine {
	protected User user;
	
	public UserMachine(User user) {
		this.user = user;
	}
	
	public User makeUser() {
		return (User)user.clone();
	}

}
