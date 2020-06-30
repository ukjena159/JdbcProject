package com.uk.Createstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddColumn {

	public static void main(String[] args) {
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Oracle_1");
		Statement st=con.createStatement(); 
		String sql="alter table employee add(mobile_no int)";
		st.executeUpdate(sql);
		System.out.println("add successful");
		st.close();
		con.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
