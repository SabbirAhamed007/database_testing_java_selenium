package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. create connection between program and database
 * 2. Create statement
 * 3. execute statement
 * 4. close connection
 */

public class Data_base {
	
	
	public static void main(String[] args) throws SQLException{
		
		//step1
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","username","password");
		
		//step2
		
		Statement stmt= con.createStatement();
		
		//step3: execute sql statement 
		
		String s = "insert into users value(102, 'username', 'password')";
		
		stmt.executeQuery(s);
		
		// close the connection
		
		con.close();
		
		System.out.println("program is exited");
		
		
		// now open database to see the record
		
		
		
	}

}
