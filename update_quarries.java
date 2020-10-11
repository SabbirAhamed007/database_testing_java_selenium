package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update_quarries {
	
	/*
	 * 1. create connection between program and database
	 * 2. Create statement
	 * 3. execute statement
	 * 4. close connection
	 */

	public static class Data_base {
		
		
		public static void main(String[] args) throws SQLException{
			
			//step1
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","username","password");
			
			//step2
			
			Statement stmt= con.createStatement();
			
			//step3: update sql statement 
			
			
			String s = "update users set username='username' whereuserid=102";
			
			stmt.executeQuery(s);
			
			// close the connection
			
			con.close();
			
			System.out.println("program is exited");
			
			
			// now open database to see the record
			
			
			
		}
		

}


