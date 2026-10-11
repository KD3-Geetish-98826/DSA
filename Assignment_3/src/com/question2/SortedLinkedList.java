package com.question2;

import java.util.Scanner;

public class SortedLinkedList {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter the value: ");
			int value = sc.nextInt();
			list.insertSorted(value);
		}
		
		System.out.println("After sorting : ");
		
		list.display();
		sc.close();
	}

}
