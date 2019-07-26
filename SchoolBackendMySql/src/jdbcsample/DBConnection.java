package jdbcsample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	
	
	private static final String USERNAME = "hussy";
	private static final String PASSWORD = "password";
	private static final String CONN = "jdbc:mysql://localhost:8889/school?serverTimezone=UTC#/";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(CONN, USERNAME, PASSWORD);
		
	}

}
