package com.greedy.emp;

import static com.greedy.common.JDBCTemplate.getConnection;
import static com.greedy.common.JDBCTemplate.close;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class EmployeeDAO {

	public void findOneEmpByEmpId(String inputEmpId) {
		
		Connection con = getConnection();
		
		Statement stmt = null;
		
		ResultSet rset = null;
		
		
		try {
			stmt = con.createStatement();
			
			rset = stmt.executeQuery("SELECT EMP_ID, EMP_NAME FROM EMPLOYEE");
			
			while(rset.next()) {
				System.out.println(rset.getString("EMP_ID") + " , " + rset.getString("EMP_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con);
			close(stmt);
			close(rset);
			
		}

		
		
	}
	

	
}