package com.sdlc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudentDemo {

	public static void main(String[] args) {
	
		 try 
		 {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // load the driver
			 Connection connection=				
			 DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pradip1");
			 Statement st=connection.createStatement();
			 
			 String insertQuery="insert into student values(19,'Raghu')";
			 st.executeUpdate(insertQuery);
			 
			 String insertQuery1="insert into student values(19,'Raghu')";
			 st.executeUpdate(insertQuery1);
			 
			 
			 st.close();
			 connection.close(); 
			 System.out.println("inserted successfully");
		 } 
		 catch (Exception e) 
		 {
			e.printStackTrace();
		} 

	}

}
