package com.lixia.dao;

import java.util.List;

import com.lixia.pojos.User;

public interface IUserDao {
	void add(User user);
	void delete(Integer id);
	void update(User user);
	User queryOne(Integer id);
	List<User> queryAll();
	List<User> queryCombo();
	User queryLikeName(String name);
	User queryPage(int page,int size);
}
