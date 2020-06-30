package com.sdlc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudentInfoTwo {

	public static void main(String[] args)
	{
		InsertStudentInfoTwo obj=new InsertStudentInfoTwo();
		//obj.insertStudentData();
		obj.deleteStudentRecord();

	}
	public void insertStudentData()
	{
		 try
		   {
			 Class.forName("oracle.jdbc.driver.OracleDriver");  
			 Connection connection=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pradip3");
			 
			 Statement st=connection.createStatement();
			 String insertQuery="insert into student values(1,'Ram')";
			 st.executeUpdate(insertQuery);
			
		/*	 
			 String insertQuery2="insert into student values(2,'hgjgjg')";
			 st.executeUpdate(insertQuery2);*/
			 
			 
			 
			 st.close();
			 connection.close(); 
		   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
	}
	public void deleteStudentRecord()
	{
		 try
		   {
			 Class.forName("oracle.jdbc.driver.OracleDriver");  
			 Connection connection=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pradip1");
			 
			 Statement st=connection.createStatement();
			 String insertQuery="deletee from student where id=1";
			 st.executeUpdate(insertQuery);
			 st.close();
			 connection.close(); 
		   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
	}
  public void updateStudentRecord()
  {
	  try
	   {
		 Class.forName("oracle.jdbc.driver.OracleDriver");  
		 Connection connection=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pradip3");
		 
		 Statement st=connection.createStatement();
		 String insertQuery="update student set name='hari' where id=1)";
		 st.executeUpdate(insertQuery);
		 st.close();
		 connection.close(); 
	   }
	   catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
  }
}
