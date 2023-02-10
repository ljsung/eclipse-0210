package com.greedy.emp;

import static com.greedy.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Application {
	
	public static void main(String[] args){

		Connection con = getConnection();
		
		Statement stmt = null;
		ResultSet rset = null;
		
		EmployeeDAO selectedEmp = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("조회하실 사번을 입력해 주세요 : ");
		String empId = sc.nextLine();
		
		String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = '" + empId + "'";
		
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
		
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
