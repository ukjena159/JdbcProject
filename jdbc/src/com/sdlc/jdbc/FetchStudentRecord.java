package com.sdlc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchStudentRecord 
{

	public static void main(String[] args) 
	{
		 Connection connection=null;
		 Statement st=null;
		 ResultSet rs=null;
		try
          {
			connection=DBConnection.getOracleConnection();
			st = connection.createStatement();

			String fetchData = "select * from student";
			rs = st.executeQuery(fetchData);
  

			//for(;rs.next();)
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
				//System.out.println(rs.getInt("sid") + " " + rs.getString("name"));
				
			}
		}
		   catch(Exception ex)
		   {
			 ex.printStackTrace();  
		   }
           finally
           {
        	  try {
				rs.close();
				st.close();
	        	connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	  
           }
		
	}

}
