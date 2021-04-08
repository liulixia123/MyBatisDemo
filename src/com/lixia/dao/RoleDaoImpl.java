package com.lixia.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lixia.mapper.RoleMapper;
import com.lixia.pojos.Role;
import com.lixia.util.MybatisUtil;

public class RoleDaoImpl {
	public List<Role> queryAll() {
		// TODO Auto-generated method stub
		//获取session
		SqlSession sqlsession = MybatisUtil.getSessoon();
		RoleMapper mapper = sqlsession.getMapper(RoleMapper.class);
		List<Role> roles = mapper.queryAll();
		System.out.println(roles.get(1).getRolename());
		System.out.println(roles);
		//关闭session
	    MybatisUtil.closeSession();
		return roles;
	}
	public int Insert() {
		//获取session
		SqlSession sqlsession = MybatisUtil.getSessoon();
		RoleMapper mapper = sqlsession.getMapper(RoleMapper.class);
		Role role1 = new Role();
		role1.setRolename("经理");
		int id = mapper.insert(role1);
		sqlsession.commit();
		List<Role> roles = mapper.queryAll();
		//System.out.println(roles.get(1).getRolename());
		System.out.println(roles);
		//关闭session
	    MybatisUtil.closeSession();
		return 1;
	}
	public int Update() {
		//获取session
		SqlSession sqlsession = MybatisUtil.getSessoon();
		RoleMapper mapper = sqlsession.getMapper(RoleMapper.class);
		Role role1 = new Role();
		role1.setId(11);
		role1.setRolename("经理");
		int id = mapper.update(role1);
		sqlsession.commit();
				
				//关闭session
			    MybatisUtil.closeSession();
				
		return id;
	}
	public int Delete() {
		//获取session
		SqlSession sqlsession = MybatisUtil.getSessoon();
		RoleMapper mapper = sqlsession.getMapper(RoleMapper.class);
		
		int id = mapper.delete(6);
		sqlsession.commit();
				
		//关闭session
	    MybatisUtil.closeSession();
				
		return id;
	}
}
