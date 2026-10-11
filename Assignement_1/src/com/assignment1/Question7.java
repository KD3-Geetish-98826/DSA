package com.assignment1;

import java.util.Scanner;

public class Question7 {

	static Scanner sc = new Scanner(System.in);

	public static int search(int nums[], int target) {
		int left = 0, right = nums.length - 1, mid;
		while (left <= right) {

			mid = (left + right) / 2;
			if (target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}


	public static void main(String[] args) {

		System.out.print("Enter the Size of Array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the Elements: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("the list of no is : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("");

		System.out.println("Enter the target: ");
		int target = sc.nextInt();

		search(arr, target);
	}
}
