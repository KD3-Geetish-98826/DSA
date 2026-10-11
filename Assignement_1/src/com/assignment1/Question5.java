package com.assignment1;

import java.util.Scanner;

public class Question5 {

	static Scanner sc = new Scanner(System.in);

	public static int fibonacci(int n) {

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
		
	}

	public static void main(String[] args) {

		System.out.print("Enter the nth term for Fibonacci Series: ");
		int n = sc.nextInt();

		System.out.println(" The Fibonacci Series is: ");
		for (int i = 0; i <= n; i++) {
			long f = fibonacci(i);
			System.out.print(f);
		}
		sc.close();
	}
}
