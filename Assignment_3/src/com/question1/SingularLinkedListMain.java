package com.question1;

import java.util.Scanner;

public class SingularLinkedListMain {

	static Scanner sc = new Scanner(System.in);

	public static int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Add data to the EMPTY Singular Linked List");;
		System.out.println("2. Insert a new node AFTER a given data");
		System.out.println("3. Insert a new node BEFORE a given data");
		System.out.println("4. Display");
		System.out.print("Enter your choice: ");
		return sc.nextInt();

	}

	public static void main(String[] args) {
		SingularLinkedList list = new SingularLinkedList();
		int choice;
		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				list.addfirst(40);
				list.addfirst(30);
				list.addfirst(20);
				list.addfirst(10);
				System.out.println();
				list.display();
				System.out.println();
				break;
			case 2:
				System.out.println();
				System.out.print("Enter the value AFTER which you want to add: ");
				int v1 = sc.nextInt();
				System.out.print("Enter the value that needs to be inserted: ");
				int v2 = sc.nextInt();
				list.addAfter(v1,v2);
				list.display();
				System.out.println();
				break;
			case 3:
				System.out.println();
				System.out.print("Enter the value BEFORE which you want to add: ");
				int v3 = sc.nextInt();
				System.out.print("Enter the value that needs to be inserted: ");
				int v4 = sc.nextInt();
				list.addBefore(v3, v4);
				list.display();
				System.out.println();
				break;
			case 4:
				list.display();
				System.out.println();
				break;
			default:
				System.out.println("Invalid Choice!!");
				break;
			}
		}
	}

}
