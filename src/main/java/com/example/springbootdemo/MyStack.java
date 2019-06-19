package com.example.springbootdemo.src.main.java.com.example.springbootdemo;

import java.io.Serializable;

/**
 * 类 名: MyStack
 * 描 述: TDDD
 * 作 者: 单兴民
 * 创 建: 2019/4/1 9:43
 * 邮 箱: 472842181@qq.com
 */
public class MyStack implements Serializable {

	private static String name;

	private int[] elements;

	private int length;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		MyStack.name = name;
	}

	public int getLength() {
		return elements.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public MyStack(int... objects){
		elements=objects;
		length=elements.length;
	}
	//添加
	public void push(int object){
		int[] objects=new int[elements.length+1];
		for(int i=0;i<elements.length;i++){
			objects[i]=elements[i];
		}
		objects[elements.length]=object;
		elements=objects;
	}
	//取出之后移除
	public int pop(){
		if(length==0){
			throw new RuntimeException();
		}
		int object=elements[elements.length-1];
		int[] objects=new int[elements.length-1];
		for(int i=0;i<objects.length;i++){
			objects[i]=elements[i];
		}
		elements=objects;
		return object;
	}
	//取出之后不移除
	public int peek(){
		if(length==0){
			return 0;
		}
		int object=elements[elements.length-1];
		return object;
	}
	public int search(int object){
		if(length==0){
			return -1;
		}
		int i=0;
		for(int element:elements){
			if(element==object){
				return i;
			}
			i++;
		}
		return -1;
	}

}
