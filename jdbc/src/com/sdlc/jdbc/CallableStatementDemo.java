package com.sdlc.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementDemo {

	public static void main(String[] args) {
		
		
		try {
			Connection con=DBConnection.getOracleConnection();
			CallableStatement cst=con.prepareCall("{call studentOpertion}");
			cst.execute();
			System.out.println("procedure callec");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

// i want to inset a student recored then i will update the same recored with different name

/*what is CallableStatement
 * callableStatemet is used to call the stored procedure or function
 * */

