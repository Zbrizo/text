package com.example.springbootdemo.src.main.java.com.example.springbootdemo;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 类 名: ObjectStream
 * 描 述: TDDD
 * 作 者: 单兴民
 * 创 建: 2019/4/11 16:31
 * 邮 箱: 472842181@qq.com
 */
public class ObjectStream {
	public static void main(String[] args) throws Exception {
		/*TestClass a=new TestClass();
		a.setName("张三");
		a.setNickName("老张");
		a.setOrder("1234");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("测试.txt"));
		objectOutputStream.writeObject(a);*/
		/*ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("测试.txt"));
		TestClass a=(TestClass) objectInputStream.readObject();
		System.out.println();*/
		//ObjectInputStream objectInputStream=new ObjectInputStream();


		FileOutputStream  file=new FileOutputStream("测试.txt");

		ObjectOutputStream objectOutputStream=new ObjectOutputStream(file);
	}




}
