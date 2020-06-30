package com.sdlc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.sdlc.jdbc.DBConnection;

public class UpdateDataUsingPreparedStatement {

	public static void main(String[] args) {
		try {
			Connection connection = DBConnection.getOracleConnection();
			PreparedStatement pst = 
					connection.prepareStatement("update student set name=? where sid=?");
			pst.setString(1, "sita"); 
			pst.setInt(2, 19);
			pst.executeUpdate();

			pst.close();
			connection.close();
			System.out.println("data got updated sucessfully");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
