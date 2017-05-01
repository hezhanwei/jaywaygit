package com.yishao.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yishao.dao.UserDao;
import com.yishao.domain.User;
import com.yishao.service.UserService;

@Repository
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUserList(User user) {
		return userDao.getUserList(user);
	}

}
