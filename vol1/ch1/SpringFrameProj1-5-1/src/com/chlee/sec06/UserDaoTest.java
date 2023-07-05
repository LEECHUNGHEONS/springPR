package com.chlee.sec06;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chlee.sec07.DaoFactory;
import com.chlee.sec07.UserDao;
import com.chlee.sec08.User;


public class UserDaoTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(DaoFactory.class);
		
		System.out.println("hello world");
		
		UserDao dao = context.getBean("userDao", UserDao.class);

		User user = new User();
		user.setId("whiteship");
		user.setName("토비씨");

		user.setPassword("married");

		dao.add(user);
			

		System.out.println(user.getId() + "\n등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId() + "\n조회 성공");
	

	}
}
