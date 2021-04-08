package com.lixia.pojos;
import com.lixia.pojos.Role;

public class User {
	private Integer id;
	private String username;
	private String password;
	private Role role;
	private int roleid;
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public User() {}
	public User(Integer Id,String username) {
		this.id = Id;
		this.username = username;
	}
	public Integer getId() {
		return id;
	}	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}	
	public void setUsername(String username) {
		this.username = username;
	}	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ",roleid=" + roleid +"]";
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
}
