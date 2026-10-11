package com.question2;

public class LinkedList {

	static class Node {
		int data;
		Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public LinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insertSorted(int value) {
		Node newnode = new Node(value);
		if (head == null)
			head = newnode;
		else if (head.data >= value) {
			newnode.next = head;
			head = newnode;
		} else {
			Node trav = head;
			while (trav.next != null && trav.next.data < value)
				trav = trav.next;
			newnode.next = trav.next;  // Connect new node to the next node
			trav.next = newnode;       // Connect current node to new node
		}

	}

	public void display() {
		Node trav = head;

		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}

}
