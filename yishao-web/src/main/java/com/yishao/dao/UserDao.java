package com.yishao.dao;

import java.util.List;

import com.yishao.domain.User;

public interface UserDao {

	List<User> getUserList(User user);
}
