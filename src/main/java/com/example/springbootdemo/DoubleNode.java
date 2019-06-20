package com.example.springbootdemo.src.main.java.com.example.springbootdemo;

/**
 * 类 名: DoubleNode
 * 描 述: 双向循环链表
 * 作 者: 单兴民
 * 创 建: 2019/4/3 14:07
 * 邮 箱: 472842181@qq.com
 */
public class DoubleNode {
	private DoubleNode pre=this;

	private Object object;

	private DoubleNode next=this;


	public DoubleNode(){

	}

	public DoubleNode(Object object){
		this.object=object;
	}

	public DoubleNode getPre() {
		return pre;
	}

	public void setPre(DoubleNode pre) {
		this.pre = pre;
	}

	public void after(DoubleNode element){
		DoubleNode nextNode=this.next();
		this.next=element;
		element.setNext(nextNode);
		element.setPre(this);
		nextNode.setPre(element);
	}



	public DoubleNode removeNext(){
		DoubleNode sonNode=this.next;
		DoubleNode grandNode=new DoubleNode();
		if(this.hasNext()){
			grandNode=sonNode.next();
		}
		this.next=grandNode;
		return this;
	}


	public boolean hasNext(){
		if(next==null){
			return false;
		}else {
			return true;
		}
	}

	public DoubleNode next() {
		return next;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public DoubleNode getNext() {
		return next;
	}

	public void setNext(DoubleNode nextNode) {
		this.next = nextNode;
	}




}
