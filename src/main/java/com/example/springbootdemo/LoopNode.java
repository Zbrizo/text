package com.example.springbootdemo.src.main.java.com.example.springbootdemo;

/**
 * 类 名: LoopNode
 * 描 述: 循环链表
 * 作 者: 单兴民
 * 创 建: 2019/4/3 10:19
 * 邮 箱: 472842181@qq.com
 */
public class LoopNode {
	private Object object;

	private LoopNode nextNode=this;

	public LoopNode(){

	}

	/*public void append(Object object) {
		Node newNode = new Node();
		newNode.setObject(object);
		if (this.object == null) {
			this.object = object;
		} else {
			Node current = new Node();
			current = this.nextNode;
			if (current == null) {
				this.nextNode= newNode;
			} else {
				while (current.hasNext()) {
					current = current.getNextNode();
				}
				current.setNextNode(newNode);
			}
		}
	}*/

	/*public void append(Object object) {
		LoopNode node = this;
		if (this.getObject() != null) {
			while (node.hasNext()) {
				node = node.getNextNode();
			}
			LoopNode newNode = new LoopNode();
			newNode.setObject(object);
			node.setNextNode(newNode);
		} else {
			this.setObject(object);
		}
	}*/

	public void after(LoopNode element){
		LoopNode nextNode=this.getNextNode();
		this.setNextNode(element);
		element.setNextNode(nextNode);
	}


	public void show(){
		LoopNode node=this;
		while (node!=null){
			System.out.println("链表节点："+node.getObject());
			node=node.getNextNode();
		}
	}

	public LoopNode removeNext(){
		LoopNode sonNode=this.nextNode;
		LoopNode grandNode=new LoopNode();
		if(this.hasNext()){
			grandNode=sonNode.getNextNode();
		}
		this.setNextNode(grandNode);
		return this;
	}


	public boolean hasNext(){
		if(nextNode==null){
			return false;
		}else {
			return true;
		}
	}

	public LoopNode next() {
		return nextNode;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public LoopNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(LoopNode nextNode) {
		this.nextNode = nextNode;
	}
}
