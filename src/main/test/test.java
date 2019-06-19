package com.example.springbootdemo.src.main.test;

import com.example.springbootdemo.src.main.java.com.example.springbootdemo.MyStack;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;

/**
 * 类 名: test
 * 描 述: TDDD
 * 作 者: 单兴民
 * 创 建: 2019/6/19 9:23
 * 邮 箱: 472842181@qq.com
 */
public class test {
	public static void main(String[] args) throws Exception{
	/*	MyStack stack=new MyStack(1,2,3,4);
		MyStack.setName("测试测试");
		FileOutputStream fileOutputStream=new FileOutputStream("Serializable.txt");
		ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
		outputStream.writeObject(stack);
		MyStack stack1=new MyStack();*/


		FileInputStream fileInputStream=new FileInputStream("Serializable.txt");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		MyStack stack=(MyStack) objectInputStream.readObject();
		Field field=stack.getClass().getDeclaredField("name");
		field.setAccessible(true);
		String object=(String)field.get(stack);
		System.out.println(object);

	}

}
