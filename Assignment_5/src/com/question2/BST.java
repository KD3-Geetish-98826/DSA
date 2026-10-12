package com.question2;

import java.util.Stack;

import com.question1.BST.Node;

public class BST {

	public class Node {
		private int data;
		private Node left, right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	private Node root;

	public BST() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		Node newNode = new Node(value);

		if (root == null) {
			root = newNode;
		} else {
			Node trav = root;
			while (true) {
				if (value < trav.data) {
					if (trav.left == null) {
						trav.left = newNode;
						break;
					} else {
						trav = trav.left;
					}
				} else {
					if (trav.right == null) {
						trav.right = newNode;
						break;
					} else {
						trav = trav.right;
					}
				}
			}
		}
	}

	private void preOrder(Node root) {
		Stack<Node> s = new Stack<>();
		s.push(root);
		while (!s.isEmpty()) {
			Node trav = s.pop();
			System.out.print(" " + trav.data);
			if (trav.right != null)
				s.push(trav.right);
			if (trav.left != null)
				s.push(trav.left);
		}
		System.out.println();
	}

	public void preOrder() {
		System.out.print("Preorder : ");
		preOrder(root);
		System.out.println();
	}
	
	private void postOrder(Node root) {
	    if (root == null)
	        return;

	    Stack<Node> s1 = new Stack<>();
	    Stack<Node> s2 = new Stack<>();

	    s1.push(root);

	    while (!s1.isEmpty()) {
	        Node trav = s1.pop();
	        s2.push(trav);

	        if (trav.left != null)
	            s1.push(trav.left);

	        if (trav.right != null)
	            s1.push(trav.right);
	    }

	    while (!s2.isEmpty()) {
	        System.out.print(" " + s2.pop().data);
	    }
	}

	public void postOrder() {
	    System.out.print("Postorder : ");
	    postOrder(root);
	    System.out.println();
	}
	
	private void inOrder(Node root) {
	    Stack<Node> s = new Stack<>();
	    Node trav = root;

	    while (trav != null || !s.isEmpty()) {

	        while (trav != null) {
	            s.push(trav);
	            trav = trav.left;
	        }

	        trav = s.pop();
	        System.out.print(" " + trav.data);

	        trav = trav.right;
	    }
	}

	public void inOrder() {
	    System.out.print("Inorder : ");
	    inOrder(root);
	    System.out.println();
	}
}
