package com.example.springbootdemo.src.main.java.com.example.springbootdemo;

import java.io.Serializable;

/**
 * 类 名: TestClass
 * 描 述: TDDD
 * 作 者: 单兴民
 * 创 建: 2019/4/11 16:48
 * 邮 箱: 472842181@qq.com
 */
public class TestClass implements Serializable {

	private static final long serialVersionUID = 1L;

  private String name;

  private String nickName;

  private String order;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}
}
