package com.intheeast.springframe.dao;

import java.sql.SQLException;


import com.chlee.springframe.domain.User;



public class UserDaoTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDao dao = new UserDaoFactory().userDao();

		User user = new User();
		user.setId("whiteship");
		user.setName("백기선");
		user.setPassword("married");

		dao.add(user);

		System.out.println(user.getId() + " 등록성공 ");

		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());

		System.out.println(user2.getId() + " 조회성공 ");

			
		System.out.println(user.getId() + "\n등록 성공");
		
		User user3 = dao.get(user.getId());
		System.out.println(user3.getName());
		System.out.println(user3.getPassword());
			
		System.out.println(user3.getId() + "\n조회 성공");


}
}
