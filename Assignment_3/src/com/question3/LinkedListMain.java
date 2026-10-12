package com.question3;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addPosition(10, 1);
		list.addPosition(20, 2);
		list.addPosition(30, 3);
		
		list.deletePosition(3);

		list.display();
	}
}
