package com.yishao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yishao.domain.User;
import com.yishao.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="queryUserList",method=RequestMethod.POST)
	@ResponseBody
	public List<User> queryUserList(User user){
		
		user.setId(1);
		List<User> userList = userService.getUserList(user);
		return userList;
	}
}
