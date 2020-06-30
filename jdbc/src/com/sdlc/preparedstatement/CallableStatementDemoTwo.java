package com.sdlc.preparedstatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CallableStatementDemoTwo 
{

	public static void main(String[] args) 
	{
		try
		   {
			 Class.forName("oracle.jdbc.driver.OracleDriver");  
			 Connection connection=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sdlc123");
			 CallableStatement cst=connection.prepareCall("{call INSERTR(?,?)}");
			 cst.setInt(1, 100);
			 cst.setString(2, "Sita");
			 cst.execute();
			 connection.close(); 
			 System.out.println("data got fetched s sucessfully");
		   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }

	}

}
