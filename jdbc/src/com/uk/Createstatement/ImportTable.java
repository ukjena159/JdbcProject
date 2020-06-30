package com.uk.Createstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ImportTable {



	public static void main(String[] args) {
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Oracle_1");
		String qr="insert into employee values(124,'tokio')";
		Statement st= con.createStatement();
		st.executeUpdate(qr);
		System.out.println(" inserted successfully");
		st.close();
		con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}

}
}
