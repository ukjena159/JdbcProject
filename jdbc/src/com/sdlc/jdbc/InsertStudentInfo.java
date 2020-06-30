package com.sdlc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentInfo {
	Statement st = null;
	Connection connection = null;

	public static void main(String[] args) {
		InsertStudentInfo obj = new InsertStudentInfo();
		obj.insertStudentData();
		obj.updateStudentRecord();
		obj.deleteStudentRecord();
		
	}

	public void insertStudentData() {
		try {
			connection = DBConnection.getOracleConnection();
			st = connection.createStatement();
			String insertQuery = "insert into student values(1,'Ram')";
			st.executeUpdate(insertQuery);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				st.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public void deleteStudentRecord() {
		try {

			connection = DBConnection.getOracleConnection();
			st = connection.createStatement();
			String insertQuery = "delete from student where id=1";
			st.executeUpdate(insertQuery);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			
			try {
				st.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void updateStudentRecord() {
		try {

			Connection connection = DBConnection.getOracleConnection();
			Statement st = connection.createStatement();
			String insertQuery = "update student set name='shyam' where id=1)";
			st.executeUpdate(insertQuery);
			st.close();
			connection.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
