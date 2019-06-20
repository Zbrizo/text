package com.example.springbootdemo.src.main.test;

/**
 * 类 名: User
 * 描 述: TDDD
 * 作 者: 单兴民
 * 创 建: 2019/6/19 16:31
 * 邮 箱: 472842181@qq.com
 */
public class User {
	public User(){}
	private String id;
	private String name;
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}
}
