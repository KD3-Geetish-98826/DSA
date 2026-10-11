package com.question1;

import java.util.Scanner;

public class QueueMain {

	static Scanner sc = new Scanner(System.in);

	public static int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Offer");
		System.out.println("2. Poll");
		System.out.println("3. Element");
		System.out.print("Enter your choice: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		System.out.print("Enter the Size of queue: ");
		Queue q = new Queue(sc.nextInt());

		int choice;
		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				System.out.print("Enter the value: ");
				q.offer(sc.nextInt());
				break;
			case 2:
				System.out.println("The deleted element is: " + q.poll());
				break;
			case 3:
				System.out.println("The element is: " + q.element());
				break;

			default:
				System.out.println("Invalid choice!!");
				break;
			}
		}

	}

}
