package com.example.springbootdemo.src.main.java.com.example.springbootdemo;

/**
 * 类 名: TestFebonacci
 * 描 述: TDDD
 * 作 者: 单兴民
 * 创 建: 2019/4/3 16:28
 * 邮 箱: 472842181@qq.com
 */
public class TestFebonacci {

	private static long zero=1;

	private static long one=1;

	private static long two=0;

	private static int index=3;

	public static void show(){
		two=one+zero;
		System.out.println(two);
		zero=one;
		one=two;
		show();
	}

	public static long retunNum(int i){
		if(i==1||i==2){
			return 1;
		}else{
			return retunNum(i-1)+retunNum(i-2);
		}

	}

	public static void main(String[] args){
		/*show();*/
		for(int i=1;i<20;i++){
			System.out.println(retunNum(i));
		}


	}

}
