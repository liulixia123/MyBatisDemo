package com.lixia.pojos;

import java.util.List;

public class Role {
	private int Id;
	private String rolename;
	private List<User> users;
	public Role() {}
	public Role(String rolename) {
		this.rolename = rolename;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	@Override
	public String toString() {
		return "Role [id=" + Id + ", rolename=" + rolename +",users="+users+ "]";
	}
	public List<User> getUser() {
		return users;
	}
	public void setUser(List<User> users) {
		this.users = users;
	}
}
