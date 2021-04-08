package com.lixia.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lixia.dao.UserDaoImpl;
import com.lixia.pojos.User;
import com.lixia.util.initLogRecord;

public class Test {
	public void testSelectUser() {
		initLogRecord.initLog();
		SqlSessionFactory factory = null;//会话工厂
		//读取配置文件
		String resource = "com/lixia/config/mybatis.xml";
		InputStream is;
		try {
		    is = Resources.getResourceAsStream(resource);//获取配置文件
		    factory = new SqlSessionFactoryBuilder().build(is);//创建会话
		    SqlSession session= factory.openSession();//会话session
		    //根据id查询用户		    
		    User user = session.selectOne("com.lixia.mapper.selectUser", 2);
		    System.out.println(user);
		    session.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	public void testSelectOneUser() {
		initLogRecord.initLog();
		UserDaoImpl userdao = new UserDaoImpl();
		userdao.queryOne(2);
	}
	public void testSelectLikeName() {
		initLogRecord.initLog();
		UserDaoImpl userdao = new UserDaoImpl();
		//userdao.queryLikeName("%"+"hel"+"%");
		userdao.queryLikeName("hel");
	}
	public void testSelectPage() {
		initLogRecord.initLog();
		UserDaoImpl userdao = new UserDaoImpl();
		userdao.queryPage(0,5);
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.testSelectUser();
		//t.testSelectOneUser();
		//t.testSelectLikeName();
		//t.testSelectPage();
	}
}
