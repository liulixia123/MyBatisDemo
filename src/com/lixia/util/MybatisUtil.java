package com.lixia.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class MybatisUtil {
	private static SqlSessionFactory factory = null;//会话工厂
	private static String resource = "com/lixia/config/mybatis.xml";
	private static ThreadLocal<SqlSession> tl = null;
	static {
		InputStream is;
		try {
		    is = Resources.getResourceAsStream(resource);//获取配置文件
		    factory = new SqlSessionFactoryBuilder().build(is);//创建会话
		    //初始化池
		    tl = new ThreadLocal<>();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	//获取session
	public static SqlSession getSessoon() {
		SqlSession sqlsession= tl.get();
		if(sqlsession == null) {
			sqlsession = factory.openSession();
			tl.set(sqlsession);
		}
		return sqlsession;
		
	}
	//关闭session
	public static void closeSession() {
		SqlSession sqlsession= tl.get();
		if(sqlsession!=null) {
			sqlsession.close();
			tl.remove();
		}
	}
}
