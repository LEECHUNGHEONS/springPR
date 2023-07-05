package com.intheeast.springframe.dao;

import java.sql.SQLException;

<<<<<<< HEAD:vol1/ch1/SpringFrameProj1-3-3/src/com/kitec/springframe/dao/UserDaoTest.java
import com.kitec.springframe.domain.User;
=======
import com.intheeast.springframe.domain.User;

>>>>>>> 19b2387d8f021ca25c43995e04fe2b1f2803e355:vol1/ch1/SpringFrameProj1-4-2/src/com/intheeast/springframe/dao/UserDaoTest.java

public class UserDaoTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDao dao = new UserDaoFactory().userDao();

		User user = new User();
		user.setId("whiteship");
		user.setName("백기선");
		user.setPassword("married");

		dao.add(user);
<<<<<<< HEAD:vol1/ch1/SpringFrameProj1-3-3/src/com/kitec/springframe/dao/UserDaoTest.java

		System.out.println(user.getId() + " 등록성공 ");

		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());

		System.out.println(user2.getId() + " 조회성공 ");
=======
			
		System.out.println(user.getId() + "\n등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
			
		System.out.println(user2.getId() + "\n조회 성공");
>>>>>>> 19b2387d8f021ca25c43995e04fe2b1f2803e355:vol1/ch1/SpringFrameProj1-4-2/src/com/intheeast/springframe/dao/UserDaoTest.java
	}

}
