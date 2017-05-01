package com.yishao.general.user;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yishao.dao.UserDao;
import com.yishao.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:yishao-base.xml")
public class UserTest {

	@Autowired
	private UserDao userDao;
	
	@Test
	public void getUserList(){
		
		System.out.println(userDao);
		
		User user = new User();
		user.setId(1);
		
		List<User> userList = userDao.getUserList(user);
		for (User user2 : userList) {
			System.out.println(user2);
		}
	}
}
