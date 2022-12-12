package com.java.collection;

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
		this.next = null;

	}
}

public class MyList<T> {
	Node<T> start;

	public MyList() {
		start = null;
	}

	public void addInStart(T data) {
		Node<T> newNode = new Node<T>(data);
		if (start == null) {
			start = newNode;
		} else {
			newNode.next = start;
			start = newNode;
		}
	}

	public void displayList() {
		Node<T> temp;
		temp = start;
		while (temp != null) {
			System.out.println(temp.data + "-->");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
//		MyList <String> arr=new MyList<String>();
//		arr.addInStart("amit");arr.addInStart("neha");arr.addInStart("shakib");
//		arr.displayList();
		MyList<Integer> arr = new MyList<Integer>();
		arr.addInStart(34);
		arr.addInStart(90);
		arr.addInStart(10);
		arr.displayList();
	}
}
