package com.question1;

public class SingularLinkedList {

	class Node {
		int data;
		int dataAfter;
		Node next;

		public Node(int v1) {
			data = v1;
			// dataAfter = v2;
			next = null;
		}
	}

	private Node head;

	public SingularLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		Node trav = head;
		System.out.print("Singular Linked List :");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");

	}

	public void addfirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}

	public void addAfter(int v1, int v2) {

		if (head == null) {
			System.out.println("List have NO element!!");
			System.out.println();
			return;
		} else {
			Node trav = head;
			while (trav != null) {
				if (trav.data == v1) {
					Node newnode = new Node(v2);
					newnode.next = trav.next;
					trav.next = newnode;
					return;
				}
				trav = trav.next;
			}
			System.out.println(v1 + " Does NOT exits!!");

		}

	}

	public void addBefore(int v1, int v2) {
		if (head == null) {
			System.out.println("List have NO element!!");
			System.out.println();
			return;
		} else {
			Node trav = head;
			while (trav != null) {
				if (head.data == v1) {
					Node newnode = new Node(v2);
					newnode.next = head;
					head = newnode;
					return;
				} else if (trav.next.data == v1) {
					Node newnode = new Node(v2);
					newnode.next = trav.next;
					trav.next = newnode;
					return;
				}
				trav = trav.next;
			}
			System.out.println(v1 + " does NOT exits!!");
		}
	}
}
