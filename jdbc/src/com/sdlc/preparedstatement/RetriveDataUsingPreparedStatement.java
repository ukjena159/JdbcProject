package com.sdlc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sdlc.jdbc.DBConnection;

public class RetriveDataUsingPreparedStatement 
{

	public static void main(String[] args) 
	{
		try
		   {
			 Connection connection=DBConnection.getOracleConnection();
			 PreparedStatement pst=connection.prepareStatement("select * from student");
			 ResultSet rs=pst.executeQuery();
			 while(rs.next())
			 {
				 System.out.println(rs.getInt(1) + " " + rs.getString(2));
			 }
			
			 rs.close();
			 pst.close();
			 connection.close(); 
			 System.out.println("data got fetched s sucessfully");
		   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }

	}

}
