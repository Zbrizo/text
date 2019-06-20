package com.example.springbootdemo.src.main.java.com.example.springbootdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 类 名: TestA
 * 描 述: TDDD
 * 作 者: 单兴民
 * 创 建: 2019/4/26 15:33
 * 邮 箱: 472842181@qq.com
 */
public class TestA {
	public static void main(String[] args) throws Exception{
	/*	int[] a=new int[]{1,2,4,5};
		List c=Arrays.asList(a);
		FileOutputStream inputStream=new FileOutputStream("test2.txt");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(inputStream);
		objectOutputStream.writeObject(c);
		objectOutputStream.close();
		inputStream.close();*/
		FileInputStream fileInputStream=new FileInputStream("test2.txt");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		List c=(List)objectInputStream.readObject();
		Object a=c.get(0);
		System.out.println(Arrays.toString(c.toArray()));
		objectInputStream.close();
		fileInputStream.close();
	}

}
