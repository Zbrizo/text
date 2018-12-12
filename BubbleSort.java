package com.example.springbootdemo;

/**
 * @author: Administrator
 * @demand: Mpsort
 * @parameters:
 * @creationDate：2018/12/12 14:12
 */
public class BubbleSort {
	//冒泡排序
	//  定义
	// 重复地走访过要排序的数列，每次相邻的两个元素，根据排序规则两两交换，
	// 走访数列的工作是重复地进行指导没有再需要交换的数据，则数组排序完成。
	// ——简练概括，数组中元素相邻的两两交换直到重复地走访过排序的所有数列！
	static int[] nums=new int[]{18,15,10,145,257,14,2,19,114,3,9,11,1};
	public static void main(String[] args){
		int num;
		for(int i=0;i<nums.length-1;i++){
			for(int j=0;j<nums.length-1;j++){
				if(nums[j]>nums[j+1]){
					num=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=num;
				}
			}
			System.out.println();
			System.out.print("第"+(i+1)+"次冒泡：");
			for(int j:nums){
				System.out.print(j+" ,");
			}
		}
	}

}
