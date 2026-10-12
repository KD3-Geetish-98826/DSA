package com.question1;

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

	public void addNext(int value) {
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

	public int dept(int value) {
		Node trav = root;
		int level = 0;
		while(trav !=null) {
			if(trav.data == value) {
				return level;
			}else if(value < trav.data) {
				trav = trav.left;
			}else {
				trav = trav.right;
			}
			level++;
		}
		return -1;
	}

}
