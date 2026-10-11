package com.question2;

import java.util.Scanner;
import java.util.Stack;


public class DecStackMain {

	static Scanner sc = new Scanner(System.in);

	public static int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.print("Enter your choice: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		System.out.print("Enter the size of array: ");
		DecStack st = new DecStack(sc.nextInt());
		int choice;
		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				System.out.print("Enter the value: ");
				st.push(sc.nextInt());
				break;
			case 2:
				System.out.println("The poped value is: " + st.pop());
				break;
			case 3:
				System.out.println("The peeked value is: " + st.peek());
				break;

			default:
				break;
			}
		}

	}

}
