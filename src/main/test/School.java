package com.example.springbootdemo.src.main.test;

import java.io.Serializable;

/**
 * 类 名: School
 * 描 述: TDDD
 * 作 者: 单兴民
 * 创 建: 2019/6/24 14:42
 * 邮 箱: 472842181@qq.com
 */
public class School {

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	private String name;
	private String position;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "School{" +
				"name='" + name + '\'' +
				", position='" + position + '\'' +
				'}';
	}

	public School(String name, String position) {
		this.name = name;
		this.position = position;
	}

}
