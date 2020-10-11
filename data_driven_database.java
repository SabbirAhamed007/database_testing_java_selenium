package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

public class data_driven_database {
	
	public static void main(String[] args) throws SQLException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		// here i just use pure java not selenium 
		//step1
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","username","password");
		
		//step2
		
		Statement stmt= con.createStatement();
		
		//step3: execute sql statement 
		
		String s = "select username, password from users";
		
		//step4: data driven testing
		
		ResultSet rs= stmt.executeQuery(s);   //store that data into a variable
		
		while(rs.next()){
			
		String username= rs.getString("username");	// it is the column name
		String password=rs.getString("password");
		
		driver.findElement(By.name("username")).sendkeys(username);
		driver.findElement(By.name("password")).sendkeys(password);
		driver.findElement(By.name("login")).click();
		
		if(driver.getTitle().equals("Best Real Estate solution: ")){
			
			System.out.println("test case passed");
		}
		else{
			
			System.out.println("test case failed");
			
		}
		  
		driver.findElement(By.linlText("Home")).click();
		
		
		}
			
	
		
		// close the connection
		
		con.close();
		
		System.out.println("program is exited");
		
		
		// now open database to see the record
		
		
		
	}


}
