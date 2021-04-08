package com.lixia.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.lixia.mapper.UserMapper;
import com.lixia.pojos.User;
import com.lixia.util.MybatisUtil;

public class UserDaoImpl implements IUserDao {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User queryOne(Integer id) {
		// TODO Auto-generated method stub
		//获取session
		SqlSession sqlsession = MybatisUtil.getSessoon();
		User user = sqlsession.selectOne("com.lixia.mapper.selectUser", id);
	    System.out.println(user);
	    //关闭session
	    MybatisUtil.closeSession();
		return user;
	}

	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		//获取session
		SqlSession sqlsession = MybatisUtil.getSessoon();
		UserMapper mapper = sqlsession.getMapper(UserMapper.class);
		List<User> users = mapper.queryAll();
		System.out.println(users);
		//关闭session
	    MybatisUtil.closeSession();
		return users;
	}

	@Override
	public User queryLikeName(String name) {
		// TODO Auto-generated method stub
		//获取session
		SqlSession sqlsession = MybatisUtil.getSessoon();
		User user = sqlsession.selectOne("com.lixia.mapper.selectLike", name);
	    System.out.println(user);
	    //关闭session
	    MybatisUtil.closeSession();
		return null;
	}

	@Override
	public User queryPage(int page, int size) {
		// TODO Auto-generated method stub
		//获取session
		SqlSession sqlsession = MybatisUtil.getSessoon();
		//第一种方式
		/*Map<String,Object> map = new HashMap<>();
		map.put("index", page);
		map.put("size", size);
		List<User> user = sqlsession.selectList("com.lixia.mapper.selectPage", map);*/
		//第二种方式
		RowBounds rowBounds = new RowBounds(page,size);		
		List<User> user = sqlsession.selectList("com.lixia.mapper.selectPage", null,rowBounds);
	    System.out.println(user);
	    //关闭session
	    MybatisUtil.closeSession();
		return (User) user;
	}
	@Override
	public List<User> queryCombo() {
		SqlSession sqlsession = MybatisUtil.getSessoon();
		UserMapper mapper = sqlsession.getMapper(UserMapper.class);
		//User user = new User();
		//user.setUsername("he");
		//List<User> users = mapper.queryCombo(user);
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		List<User> users = mapper.queryList(list);
		System.out.println(users);
		MybatisUtil.closeSession();
		return users;
	}


}
