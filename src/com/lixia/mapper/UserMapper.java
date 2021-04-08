package com.lixia.mapper;

import java.util.List;

import com.lixia.pojos.User;
import com.lixia.pojos.Role;
public interface UserMapper {
	List<User> queryAll();
	List<User> queryCombo(User user);
	List<User> queryList(List<Integer> list);
}
