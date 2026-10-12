package com.question3;

import java.util.Scanner;

public class BTSMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BST bst = new BST();

		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(2);
		bst.addNode(15);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);

		bst.inOrder();

		System.out.println();

		System.out.println("Enter the value to find the sucessor: ");

		System.out.println(bst.sucessor(sc.nextInt()));

	}

}
