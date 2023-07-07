package com.chlee.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.chlee.sec04.ConnectionMaker;

public class UconnectionMaker implements ConnectionMaker {

	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdt_db?characterEncoding=UTF-8", 
				"root",
				"1234");
		return c;
	}
	

}
