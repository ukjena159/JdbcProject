package com.sdlc.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Types;

public class CallableStatementDemoThree {

	public static void main(String[] args) {
	
		try {
			Connection con=DBConnection.getOracleConnection();
			CallableStatement cst=con.prepareCall("{call STUDENTOPERTIONTHREE(?,?,?)}");
			cst.setInt(1, 100);
			cst.setString(2, "Hanuman");
			
			cst.registerOutParameter(3, Types.VARCHAR);
			
			cst.execute();
			
			System.out.println("procedure called");
			
			String returnValue=cst.getString(3);
			
			System.out.println("returnValue " + returnValue );
			
			cst.close();
			con.close();
			
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

