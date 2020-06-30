package com.sdlc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudentInfoOne {

	public static void main(String[] args)
	{
	   try
	   {
		 Class.forName("oracle.jdbc.driver.OracleDriver");  
		 Connection connection=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pradip1");
		 
		 Statement st=connection.createStatement();
		 String insertQuery="insert into student values(1,'Ram')";
		 st.executeUpdate(insertQuery);
		 st.close();
		 connection.close(); 
	   }
	   catch(Exception ex)
	   {
		   
	   }

	}

}
