package com.lixia.test;

import com.lixia.dao.RoleDaoImpl;
import com.lixia.dao.UserDaoImpl;
import com.lixia.util.initLogRecord;

public class MapperTest {
	public void testSelectAllUser() {
		initLogRecord.initLog();
		UserDaoImpl userdao = new UserDaoImpl();
		userdao.queryAll();
	}
	public void testSelectComb() {
		initLogRecord.initLog();
		UserDaoImpl userdao = new UserDaoImpl();
		userdao.queryCombo();
	}
	public void testSelectAllRole() {
		initLogRecord.initLog();
		RoleDaoImpl roledao = new RoleDaoImpl();
		roledao.queryAll();
	}
	public void testInsertRole() {
		initLogRecord.initLog();
		RoleDaoImpl roledao = new RoleDaoImpl();
		int id = roledao.Insert();
	}
	public void testUpdateRole() {
		initLogRecord.initLog();
		RoleDaoImpl roledao = new RoleDaoImpl();
		int id = roledao.Update();
	}
	public void testDeleteRole() {
		initLogRecord.initLog();
		RoleDaoImpl roledao = new RoleDaoImpl();
		int id = roledao.Delete();
	}
	public static void main(String[] args) {
		MapperTest t = new MapperTest();
		//t.testSelectAllUser();
		//t.testSelectAllRole();
		//t.testSelectComb();
		//t.testSelectLikeName();
		//t.testSelectPage();
		//t.testInsertRole();
		t.testUpdateRole();
		//t.testDeleteRole();
	}
}
