package com.om.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnection {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:alokbd", "alok", "alok11");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Employee");
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
		}catch(ClassNotFoundException cnf){
			
		}catch (SQLException e) {
			
		}finally{
			try{
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				
			}
			
			
		}

	}

}
