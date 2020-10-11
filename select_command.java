package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class select_command {

			
		public static void main(String[] args) throws SQLException{
			// here i just use pure java not selenium 
			//step1
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","username","password");
			
			//step2
			
			Statement stmt= con.createStatement();
			
			//step3: execute sql statement 
			
			String s = "select username, password from users";
			
			//step4: return data
			
			ResultSet rs= stmt.executeQuery(s);   //store that data into a variable
			
			while(rs.next()){
			String username= rs.getString("username");	// it is the column name
			String password=rs.getString("password");
			
			System.out.print(username+ " ");
			System.out.println(password);
			}
				
		
			
			// close the connection
			
			con.close();
			
			System.out.println("program is exited");
			
			
			// now open database to see the record
			
			
			
		}

}
