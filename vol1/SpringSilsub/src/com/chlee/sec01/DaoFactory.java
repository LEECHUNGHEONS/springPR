package com.chlee.sec01;

import org.springframework.context.annotation.Bean;

public class DaoFactory {
	
	@Bean
	public UserDao userDao() {
		return new UserDao(connectionMaker());
	}
	
	@Bean
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}

}
