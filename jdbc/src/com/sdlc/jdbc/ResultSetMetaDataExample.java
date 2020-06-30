package com.sdlc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataExample 
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
  
			ResultSetMetaData metaData=rs.getMetaData();
			
			int columnCount=metaData.getColumnCount();
			System.out.println("columnCount= " +columnCount);
				
			for(int i=1;i<=columnCount;i++){
				String columnName=metaData.getColumnName(i);
				String columnType=metaData.getColumnTypeName(i);
				System.out.println(columnName+ " is type of " + columnType);
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

/*ResultSetMetaData is an interface in java.sql package of JDBC API 
which is used to get the metadata about a ResultSet object. 
Whenever you query the database using SELECT statement, 
the result will be stored in a ResultSet object. 

Every ResultSet object is associated with one ResultSetMetaData object. 

This object will have all the meta data about a ResultSet 
object like schema name, table name, number of columns, column name, datatype of a column etc. 
You can get this ResultSetMetaData object using getMetaData() method of ResultSet.*/
