package model;

import java.util.ArrayList;
import java.util.List;

import database.DatabaseManager;

public class Users {
	private static DatabaseManager manager = DatabaseManager.getInstance();

	public static Admin createAdmin(String login, String passHash) {
		List<Permission> permissions = new ArrayList<Permission>();
		permissions.add(Permission.CanAddUser);
		// ...
		return new Admin();
	}

	public static Manager createManager(String login, String passHash) {
		List<Permission> permisions = new ArrayList<Permission>();
		permisions.add(Permission.CanAddTask);
		// ...
		return new Manager();
	}

	public static Worker createWorker(String login, String passHash) {
		List<Permission> permisions = new ArrayList<Permission>();
		permisions.add(Permission.CanWork);
		// ...
		return new Worker();
	}

}
