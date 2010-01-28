package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.Queue;

public class DatabaseManager {
	private static DatabaseManager instance;
	private Connection con;
	private DatabaseMetaData dma;
	private ResultSet res;
	private Queue q;

	private DatabaseManager() {
	}

	public static DatabaseManager getInstance() {
		if (instance == null) {
			instance = new DatabaseManager();
		}
		return instance;
	}

	public void open() {
	};

	public void close() {
	};

	public void getTableNames() {
	};

	public void getTableMetaDane() {
	};

	public void getColumnMetaDane() {
	};

	public void getColumnValue() {
	};

	public void getNextValue() {
	};

	private void execute() {
	};

	private String getPassword(String login) {
		return "";
	}

	public boolean validatePassword(String login, String password) {
		String obtainedPassword = getPassword(login);

		if (password.equals(obtainedPassword)) {
			return true;
		}
		return false;
	}

	public int getUserType(String login) {
		return 0;
	}

}
