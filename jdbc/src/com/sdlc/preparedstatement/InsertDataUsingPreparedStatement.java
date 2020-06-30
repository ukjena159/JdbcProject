package com.sdlc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.sdlc.jdbc.DBConnection;

public class InsertDataUsingPreparedStatement 
{

	public static void main(String[] args) 
	{
		try
		   {
			Connection connection=DBConnection.getOracleConnection();
			//String insertQuery="insert into student values(?,?)";
			 PreparedStatement pst=connection.prepareStatement("insert into  student values(?,?)");
			 //? is called as place holder
			 // scanning ? - always from left to right for indexing
			 pst.setInt(1,10);
			 pst.setString(2, "Ram");
			 pst.executeUpdate();
			 System.out.println("-------------");
			 
			 pst.setInt(1,20);
			 pst.setString(2, "Shyam");
			 pst.executeUpdate();
			 
			 pst.close();
			 connection.close(); 
			 System.out.println("data got insreted sucessfully");
		   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		

	}
/*It is recommended to use PreparedStatement 
if you are executing a particular SQL query multiple times. 

It gives better performance than Statement interface.
 
Because, PreparedStatement are precompiled and the query plan is created only once irrespective of how many times you are executing that query. 
This will save lots of time.*/

}
