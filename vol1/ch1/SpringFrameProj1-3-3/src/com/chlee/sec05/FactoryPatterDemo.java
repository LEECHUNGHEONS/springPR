package com.chlee.sec05;

import java.sql.SQLException;

import com.chlee.sec04.ConnectionMaker;

public class FactoryPatterDemo {

	public static void main(String[] args) {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		//객체를 얻고 메소드를 호출
		ConnectionMaker connectionFactory1 = connectionFactory.getConnetionMaker("DConnectionMaker");
		
		try {
			//Dconnection 메소드 호출 
			connectionFactory1.makeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			
		}
		
		ConnectionMaker connectionFactory2 = connectionFactory.getConnetionMaker("UConnectionMaker");
		
		try {
			connectionFactory2.makeConnection();
		} catch (ClassNotFoundException | SQLException e) {}
		

	}

}
