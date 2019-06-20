package com.example.springbootdemo.src.main.java.com.example.springbootdemo;

/**
 * 类 名: Node
 * 描 述: 单链表
 * 作 者: 单兴民
 * 创 建: 2019/4/2 11:02
 * 邮 箱: 472842181@qq.com
 */
public class Node {
	private Object object;

	private Node nextNode;

	public Node(){

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

	public void append(Object object) {
		Node node = this;
		if (this.getObject() != null) {
			while (node.hasNext()) {
				node = node.getNextNode();
			}
			Node newNode = new Node();
			newNode.setObject(object);
			node.setNextNode(newNode);
		} else {
			this.setObject(object);
		}
	}

	public void after(Node element){
		Node nextNode=this.getNextNode();
		this.setNextNode(element);
		element.setNextNode(nextNode);
	}


	public void show(){
		Node node=this;
		while (node!=null){
			System.out.println("链表节点："+node.getObject());
			node=node.getNextNode();
		}
	}

	public Node removeNext(){
		Node sonNode=this.nextNode;
		Node grandNode=new Node();
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

	public Node next() {
		return nextNode;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}
