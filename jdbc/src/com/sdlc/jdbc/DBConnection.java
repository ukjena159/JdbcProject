package com.sdlc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getOracleConnection() {
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "pradip1");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return connection;

	}
}
