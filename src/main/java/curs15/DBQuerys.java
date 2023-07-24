package curs15;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DBQuerys {
	
	public static List<String> dbSelectQuery(Connection conn, String query){
		List<String> resultList = new ArrayList<String>();
		
		try {
			Statement statement =  conn.createStatement();
			ResultSet result = statement.executeQuery(query);
			
			while(result.next()) {
				resultList.add(result.getString(5));
			}
			
			
		}catch(SQLException e) {
			System.out.println("Nu am putut executa query-ul!");
		}
		
		return resultList;
		
	}
	

}
