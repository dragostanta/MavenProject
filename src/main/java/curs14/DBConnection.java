package curs14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	
	public static Connection openDbConnection(String url, String user, String pass) {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexiune cu success!");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Nu am putut face conexiunea!");
		}
		
		
		return conn;
	}

}
