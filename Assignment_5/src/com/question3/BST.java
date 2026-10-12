package com.question3;

import com.question2.BST.Node;

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
			// return;
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
	
	private void inOrder(Node trav) {
		if (trav == null)
			return;
		inOrder(trav.left);
		System.out.print(" " + trav.data);
		inOrder(trav.right);
	}

	public void inOrder() {
		System.out.print("Tree: ");
		inOrder(root);
		System.out.println();

	}

	public int sucessor(int key) {
		Node trav = root;
		Node parent = null;

		while (trav != null) {
			if (key == trav.data)
				break;
			parent = trav;
			if (key < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		Node sucessor = trav.right;
		parent = trav;
		while(sucessor.left != null) {
			parent = sucessor;
			sucessor = sucessor.right;
		}
		return sucessor.data;

	}

}
