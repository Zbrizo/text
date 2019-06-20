package com.example.springbootdemo.src.main.java.com.example.springbootdemo;

import java.util.Arrays;

/**
 * 类 名: Class
 * 描 述: TDDD
 * 作 者: 单兴民
 * 创 建: 2019/3/31 10:13
 * 邮 箱: 472842181@qq.com
 */
public class ClassA {
	private int[] object;

	public ClassA(){
		object=new int[]{};
	}

	public ClassA(int... a){
		object=a;
		begin=0;
		end=a.length-1;
		middle=(end+begin)/2;
	}


	public int[] addObj(int num,int index){
		System.out.println(Arrays.toString(object));
		int[] a=new int[object.length+1];
		if(index<0||num>object.length){
			System.out.println("数组越界");
              throw new ArrayIndexOutOfBoundsException();
		}
		for(int i=0;i<a.length;i++){
			if(i==index){
				a[i]=num;
			}else if(i<index){
				a[i]=object[i];
			}else {
				a[i]=object[i-1];
			}
		}
		object=a;
		System.out.println(Arrays.toString(object));
		return object;
	}

	private int begin;

	private int end;

    private int middle;
	public int returnIndex(int orderNum){
		middle=(begin+end)/2;
	    int value=object[middle];
	   	if(value==orderNum){
	   		return middle;
		}else if(begin==end){
			return -1;
		}else if(value>orderNum){
	   		end=middle-1;
	   		return -2;
		}else {
	   		begin=middle+1;
	   		return -2;
		}
	}

}
