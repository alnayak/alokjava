package com.om;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDBCon {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin@localhost:1521:oracl", "alok", "orcle2");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}

	}

}
