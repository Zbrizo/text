package com.example.springbootdemo.src.main.test;

import java.io.Serializable;

/**
 * 类 名: User
 * 描 述: TDDD
 * 作 者: 单兴民
 * 创 建: 2019/6/19 16:31
 * 邮 箱: 472842181@qq.com
 */
public class User implements Serializable {

	private String name;
	private int age;
	private School school;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}


	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				", school=" + school +
				'}';
	}


}
