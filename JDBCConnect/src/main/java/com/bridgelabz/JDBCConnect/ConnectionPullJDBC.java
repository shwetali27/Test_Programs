package com.bridgelabz.JDBCConnect;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionPullJDBC {
	public static void main(String[] args) {
		try {
			ComboPooledDataSource cpds = new ComboPooledDataSource();
			cpds.setDriverClass("com.mysql.jdbc.Driver"); // loads the jdbc
															// driver
			cpds.setJdbcUrl("jdbc:mysql://localhost/CSVFile");
			cpds.setUser("root");
			cpds.setPassword("bridgeit");

			// the settings below are optional -- c3p0 can work with defaults
			cpds.setMinPoolSize(5);
			cpds.setAcquireIncrement(5);
			cpds.setMaxPoolSize(20);
			
			Connection connection  = cpds.getConnection();
			Statement stmt = connection.createStatement();
			String sql = "INSERT INTO REGISTRATION(first,last,age) VALUES ('abjhjc','gjhgzya',45)";
			
	        stmt.executeUpdate(sql);
	        connection.close();
	        
	        System.out.println("Done");
		} catch (PropertyVetoException e) {
			System.out.println(e);
		}
		catch (SQLException e) {
			System.out.println(e);
		}
	}
}
