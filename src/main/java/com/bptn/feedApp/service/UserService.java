package com.bptn.feedApp.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.bptn.feedApp.jdbc.UserDao;
import com.bptn.feedApp.jdbc.UserBean;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public List<UserBean> listUsers() {
		return this.userDao.listUsers();
	}

	public UserBean findByUsername(String username) {
		return this.userDao.findByUsername(username);
	}

	public void createUser(UserBean user) {
		this.userDao.createUser(user);
	}

}
