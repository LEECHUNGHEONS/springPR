package com.kitec.springframe.dao;

import javax.swing.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
	
	String driverClass;
	String url;
	String username;
	String password;
	
	public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
	}
	
	public void setUrl(String url) {
        this.url = url;
	}
	
	public void setUsername(String username) {
        this.username = username;
	}
	
	public void setPassword(String password) {
        this.password = password;
	}
	
	

	@Bean
	public UserDao userDao() {
		return new UserDao(connectionMaker());
		//이 곳에서 userDao의 프로퍼티를 설정함 by spring ioc 컨테이너
		// 프로퍼티란? -> 자바 빈에 대해 gpt에 물어보고
	}	
	
	@Bean
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
		
		//이곳에서 DconncetionMaker 프로퍼티를 설정함 by 
	}

}
