package com.assignment1;

import java.util.Scanner;

public class Question4 {

	static Scanner sc = new Scanner(System.in);

	public static int binarySearch(int arr[], int key) {

		int left = 0, right = arr.length - 1, mid;
		while (left <= right) {

			mid = (left + right) / 2;
			if (key == arr[mid])
				return mid;
			else if (key < arr[mid]) {
				left = mid + 1;
			} else
				right = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };

		System.out.print("Enter the key: ");
		int key = sc.nextInt();

		int index = binarySearch(arr, key);
		if (index != -1)
			System.out.println("The index for the key " + key + " is " + index);
		else
			System.out.println("Index Not Found!!");

	}
}
