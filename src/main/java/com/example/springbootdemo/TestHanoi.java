package com.example.springbootdemo.src.main.java.com.example.springbootdemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

/**
 * 类 名: TestHanoi
 * 描 述: TDDD
 * 作 者: 单兴民
 * 创 建: 2019/4/4 10:05
 * 邮 箱: 472842181@qq.com
 */
public class TestHanoi {
	private  static Stack stack=new Stack();

	private  static Stack stack1=new Stack();

	private  static Stack stack2=new Stack();


	public static void hanoi(int i, Stack from, Stack middle, Stack order){
		if(i==1){
			order.push(from.pop());
			System.out.println("源："+stack);
			System.out.println("中间："+stack1);
			System.out.println("目标："+stack2);
			System.out.println("******************************");
		}else {
			hanoi(i-1,from,order,middle);

			hanoi(i-1,middle,from,order);
		}

	}
	public static void main(String[] args) throws IOException {
		/*stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		hanoi(4,stack,stack1,stack2);*/
		/*FileWriter fileWriter= new FileWriter("测试测试.txt");
		fileWriter.write("测试1，测试2，测试3");
		fileWriter.close();*/
		FileReader fileReader=new FileReader("测试测试.txt");
		int a=fileReader.read();
		System.out.println((char)a);
		int b=fileReader.read();
		System.out.println((char)b);

	}

	public static void hanOi(Stack from,Stack middle,Stack order){
		if(from.size()==1){
			order.push(from.pop());
			System.out.println();
		}else{
			/*hanoi();*/
		}

	}

}
