package model;

import java.util.Date;
import java.util.List;

public class Worker extends User {
	public Worker() {
	}

	public Worker(int type, String login, String passHash,
			List<Permission> permissions, String firstName, String lastName,
			Date birthDate, Date employed) {
		super(type, login, passHash, permissions, firstName, lastName,
				birthDate, employed);
	}

}
