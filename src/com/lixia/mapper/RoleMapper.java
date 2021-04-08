package com.lixia.mapper;

import java.util.List;

import com.lixia.pojos.Role;

public interface RoleMapper {
	List<Role> queryAll();
	int insert(Role role);
	int update(Role role);
	int delete(int id);
}
