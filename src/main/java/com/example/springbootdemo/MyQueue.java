package com.example.springbootdemo.src.main.java.com.example.springbootdemo;

import javax.xml.soap.Node;

/**
 * 类 名: MyQueue
 * 描 述: TDDD
 * 作 者: 单兴民
 * 创 建: 2019/4/2 10:16
 * 邮 箱: 472842181@qq.com
 */
public class MyQueue {

	private Object[] elements;


	public void add(Object object){
		Object[] objects=new Object[elements.length+1];
		for(int i=0;i<elements.length;i++){
			objects[i]=elements[i];
		}
		objects[elements.length+1]=object;
		elements=objects;
	}


	public Object poll(){
		if(elements.length==0){
			return null;
		}else {
			Object object=elements[0];
			Object[] objects=new Object[elements.length-1];
			for(int i=0;i<objects.length;i++){
				objects[i]=elements[i+1];
			}
			elements=objects;
			return object;
		}

	}

}
