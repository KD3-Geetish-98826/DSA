package com.question1;

import java.util.Scanner;

public class BSTMain {

	static Scanner sc = new Scanner(System.in);

	public static int menuList() {
		System.out.println("\n0. Exit");
		System.out.println("1. Add Data");
		System.out.println("2. Level/dept from a given nood");
		System.out.println("3. Display");
		System.out.print("Enter your choice: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		BST b = new BST();
		int choice;
		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				System.out.print("\nEnter the value to be added in the tree: ");
				b.addNext(sc.nextInt());
				System.out.println("\nSucessfully added value in the tree!!");
				break;
			case 2:
				System.out.print("Enter the value from which you want the dept: ");
				int dept = b.dept(sc.nextInt());
				System.out.print("\nDept is: " + dept);
				System.out.println();
				break;
			case 3:
				System.out.print("\nSorted Tree value is: ");
				b.inOrder();
				break;
			default:
				System.out.println("\nInvalid Choice!!");
				break;
			}
		}
	}

}
