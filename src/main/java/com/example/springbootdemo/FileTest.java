package com.example.springbootdemo.src.main.java.com.example.springbootdemo;

import java.io.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * 类 名: FileTest
 * 描 述: TDDD
 * 作 者: 单兴民
 * 创 建: 2019/4/9 16:08
 * 邮 箱: 472842181@qq.com
 */
public class FileTest {



	public static void showFiles(File file,List<File> files){
		if(!file.exists()){
			System.out.println("文件不存在");
		}else if(!file.isFile()){
			File[] list= file.listFiles();
			for( File f:list){
				showFiles(f,files);
			}
		}else {
			System.out.println("存在文件："+file.getName());
			files.add(file);
		}
	}

	public static void main(String[] args)  {
	 	/*List<File> list=new ArrayList<>();
	 	File file=new File("E:");
		showFiles(file,list);
		Object o=new Object() ;
		System.out.println(o);*/
	 	/*input();*/


		/*String c=URLDecoder.decode("%E6%9D%A5%E5%90%83%F0%9F%98%9C", "utf-8");
		String b=URLEncoder.encode(c, "utf-8");
		System.out.println(c);
		System.out.println(b);*/
		//randamSeek();
		showFiles(new File("C:\\Users\\Administrator\\Desktop\\111"),new ArrayList<>());
	}

	//input output测试
	public static void input() throws IOException {
		FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Administrator\\Desktop\\图片3.png");
		BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
		BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("测试图片.png"));
		int a;
		while((a=bufferedInputStream.read())!=-1){
			bufferedOutputStream.write(a);
		}
		bufferedInputStream.close();
		bufferedOutputStream.close();
	}
	public static void print() throws IOException{
		FileInputStream fileInputStream=new FileInputStream("次数测试");
		BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
		ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
		byte[] a=new byte[5];
		while((fileInputStream.read(a))!=-1){
			byteArrayOutputStream.write(a);
		}
		System.out.println(byteArrayOutputStream);
	}

	public static void randamSeek()throws IOException{
		RandomAccessFile randomAccessFile=new RandomAccessFile("测试.txt","rw");
		randomAccessFile.seek(2);
		byte[] a={10,11,12,15};
		randomAccessFile.write(a,0,4);

		randomAccessFile.close();
	}

}
