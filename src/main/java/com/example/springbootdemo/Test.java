package com.example.springbootdemo.src.main.java.com.example.springbootdemo;

import org.omg.CORBA.portable.InputStream;

import java.io.*;
import java.util.*;

public class Test{
	List list=new ArrayList();



	static Stack stack1=new Stack();
	static Stack stack2=new Stack();

/*	public static void main(String[] args){*/
		/*int[] a=new int[]{0,1,2,3,4,5};
        System.out.println(a.length);
		int[] b=new int[a.length-1];

		for(int i=0;i<b.length;i++){
			if(i>2){
				b[i]=a[i+1];
			}else {
				b[i]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));*/
		/*ClassA a=new ClassA(0,1,2,3,4,5,6,7,8,9);
		int index;
		while (true){
			int c=a.returnIndex(11);
			if (c!=-2) {
				index=c;
				break;
			}
		}
		System.out.println(index);*/
		/*Node node=new Node();
		node.append(0);
		node.append(1);
		node.append(2);
		node.append(3);
		Node node1=node.getNextNode();
		Node node2=node1.getNextNode();
		Node node3=node2.getNextNode();
		System.out.println(node1.getObject());
		System.out.println(node2.getObject());
		System.out.println(node3.getObject());
		System.out.println(node.getObject());*/
		/*Node node=new Node();
		node.append(0);
		node.append(1);
		node.append(2);
		node.append(3);
		node.append(5);
		node.append(null);
		node.append(null);
		node.append(6);
		node.append(7);
		node.append(8);
		node.show();
		Node newNode=new Node();
		newNode.setObject("addNode");
		node.next().next().after(newNode);
		node.show();*/
		/*LoopNode loopNode=new LoopNode();
		LoopNode loopNode1=new LoopNode();
		LoopNode loopNode2=new LoopNode();
		loopNode.setObject(0);
		loopNode1.setObject(1);
		loopNode2.setObject(2);
		loopNode.after(loopNode1);
		loopNode1.after(loopNode2);
		System.out.println(loopNode.getObject());
		System.out.println(loopNode.next().getObject());
		System.out.println(loopNode.next().next().getObject());
		System.out.println(loopNode.next().next().next().getObject());
		System.out.println(loopNode.next().next().next().next().getObject());*/
	/*	DoubleNode doubleNode=new DoubleNode(0);
		DoubleNode doubleNode1=new DoubleNode(1);
		DoubleNode doubleNode2=new DoubleNode(2);
		DoubleNode doubleNode3=new DoubleNode(3);
		doubleNode.after(doubleNode1);
		doubleNode1.after(doubleNode2);
		doubleNode2.after(doubleNode3);*/
/*
	}*/

	/*public static void returnStep(Stack data,Stack middle,Stack order){
		if(data.size()==1){
			order.push(data.pop());
		}else if(data.size()==2){
			order.push(data.pop());
			order.push(middle.pop());
		}
	}

	public static void show(Stack stack){
		System.out.println("栈1"+stack);
		System.out.println("栈2"+stack1);
		System.out.println("栈3"+stack2);
		System.out.println("*********************************************");
	}*/


 /*public static void main(String[] args) throws IOException {
	 FileReader fileReader=new FileReader("测试测试.txt");
	 FileWriter fileWriter=new FileWriter("测试.txt");
	 char[] chars=new char[1024];
	 int length;
	 while ((length=(fileReader.read(chars)))!=-1){
	 	fileWriter.write(chars,0,length);
	 }
	 fileReader.close();
	 fileWriter.close();

 }*/

/* public static void main(String[] args) throws IOException {
	 BufferedReader bufferedReader=new BufferedReader(new FileReader("测试测试.txt"));
	 String line;
	 while ((line=bufferedReader.readLine())!=null){
		System.out.println(line);
	 }

 }*/

	/*public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader=new BufferedReader(new FileReader("测试测试.txt"));
		BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("测试顺序.txt"));
		String line;
		while ((line=bufferedReader.readLine())!=null){
			bufferedWriter.write(line);
			//可跨平台 windows Linux mac
			bufferedWriter.newLine();
		}
		bufferedReader.close();
		bufferedWriter.close();

	}*/
	//流尽量晚开早关
	//行数最后一行转为第一行,倒数第二行转为第二行
	/*public static void main(String[] args) throws IOException {
		String line;
		Stack stack=new Stack();
		BufferedReader bufferedReader=new BufferedReader(new FileReader("测试测试.txt"));
		while ((line=bufferedReader.readLine())!=null){
			*//*bufferedWriter.write(line);
			//可跨平台 windows Linux mac
			bufferedWriter.newLine();*//*
			stack.push(line);
		}
		bufferedReader.close();
		BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("测试顺序.txt"));
		for(int i=0;i<stack.size();i++){
			bufferedWriter.write((String) stack.pop());
			bufferedWriter.newLine();
		}
		bufferedWriter.close();

	}*/

	//添加行号
	public static void main(String[] args) throws IOException {
		/*String line;
		Stack stack=new Stack();
		LineNumberReader lineNumberReader=new LineNumberReader(new FileReader("测试测试.txt"));
		while ((line=lineNumberReader.readLine())!=null){
			*//*bufferedWriter.write(line);
			//可跨平台 windows Linux mac
			bufferedWriter.newLine();*//*
			stack.push(lineNumberReader.getLineNumber()+line);
		}
		lineNumberReader.close();
		BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("测试顺序.txt"));
		while (stack.size()!=0){
			bufferedWriter.write((String) stack.pop());
			bufferedWriter.newLine();
		}
		bufferedWriter.close();*/



		//指定字符编码读取
		/*int a;
		InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("测试顺序.txt"),"UTF-8");
		while((a=inputStreamReader.read())!=-1){
			System.out.print((char)a);
		}
		inputStreamReader.close();*/

		//计算每个字符出现次数
		/*Map<String,Integer> map=new HashMap<>();
		int a;
		Integer b;
		InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("测试顺序.txt"),"UTF-8");
		while((a=inputStreamReader.read())!=-1){
			b=map.get((char)a+"");
			if(b==null){
				map.put((char)a+"",1);
			}else {
				map.put((char)a+"",++b);
			}

		}
		inputStreamReader.close();
		OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("次数测试.txt"),"UTF-8");
		outputStreamWriter.write(map.toString());
		outputStreamWriter.close();
		OutputStreamWriter outputStreamWriter2=new OutputStreamWriter(new FileOutputStream("次数测试2.txt"),"UTF-8");

		for(String s:map.keySet()){
			outputStreamWriter2.write(s+":"+map.get(s)+",");
		}
		outputStreamWriter2.close();*/


	}


}
