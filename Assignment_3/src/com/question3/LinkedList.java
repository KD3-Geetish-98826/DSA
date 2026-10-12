package com.question3;

public class LinkedList {

	public class Node {
		int data;
		Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head, tail;

	public LinkedList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addPosition(int value, int pos) {
		Node newNode = new Node(value);

		if (head == null) {
			head = tail = newNode;
			tail.next = head;
		}

		else if (pos <= 1) {
			newNode.next = head;
			tail.next = newNode;
			head = newNode;

		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next != null; i++)
				trav = trav.next;
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}

	public void deletePosition(int pos) {

		if (head == null || pos < 1)
			return;
		else if (pos == 1) {
			head = tail = null;
		} else {
			Node trav = head;
			while(trav.next.next !=head) {
				trav = trav.next;
			}
			trav.next = head;
			tail = trav;
		}
	}
	
	public void display() {
		//0. if list is empty, return
		if(head == null)
			return ;
		System.out.print("List : ");
		//1. create trav and start at first node
		Node trav = head;
		do {
			//2. print current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}while(trav != head);//4. repeat for every node
		System.out.println("");
	}
}
