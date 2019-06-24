package com.example.springbootdemo.src.main.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 类 名: SerializableTest
 * 描 述: Json序列化的方法
 * 作 者: 单兴民
 * 创 建: 2019/6/19 15:01
 * 邮 箱: 472842181@qq.com
 */
public class SerializableTest {

	/**
	 * 初始化User对象
	 * @return user
	 */
	private static User initUser(){
		User user = new User();
		user.setName("jison");
		user.setAge(10);
		return user;
	}

	public static void main(String[] args) throws Exception {
		// fastjson用法
		fastjson();
		// jackson用法
		jackson();
		// gson用法
		gson();
	}

	private static void fastjson(){
		// 将Java对象序列化为Json字符串
		String objectToJson = JSON.toJSONString(initUser());
		System.out.println(objectToJson);
		// 将Json字符串反序列化为Java对象
		User user = JSON.parseObject(objectToJson, User.class);
		System.out.println(user);
	}

	private static void jackson() throws Exception{
		ObjectMapper objectMapper = new ObjectMapper();
		// 将Java对象序列化为Json字符串
		String objectToJson = objectMapper.writeValueAsString(initUser());
		System.out.println(objectToJson);
		// 将Json字符串反序列化为Java对象
		User user = objectMapper.readValue(objectToJson, User.class);
		System.out.println(user);
	}

	private static void gson(){
		Gson gson = new GsonBuilder().create();
		// 将Java对象序列化为Json字符串
		String objectToJson = gson.toJson(initUser());
		System.out.println(objectToJson);
		// 将Json字符串反序列化为Java对象
		User user = gson.fromJson(objectToJson, User.class);
		System.out.println(user);
	}

}
