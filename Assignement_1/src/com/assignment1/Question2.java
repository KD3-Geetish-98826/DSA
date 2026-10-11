package com.assignment1;

import java.util.Scanner;

public class Question2 {

	public static int linearSearch(int arr[], int key) {
		//int index = -1;
		/*
		 * for (int i = 0; i < arr.length; i++) {
		 *  if (key == arr[i]) { 
		 *  index = i; 
		 *  }
		 * }
		 */
		
		for(int i = arr.length -1 ; i >= 0; i--) {
			if(key == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 77, 55, 11, 77, 42, 88, 77, 33, 66, 77 };

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the key: ");
		int key = sc.nextInt();

		int index = linearSearch(arr, key);
		if (index != -1) {
			System.out.print("The last occurance of Key index is : " + index);
		} else
			System.out.println("Key Not found!!");
	}

}
