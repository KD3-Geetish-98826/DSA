package com.assignment1;

import java.util.Scanner;

public class Question8 {

	static Scanner sc = new Scanner(System.in);
	
	public static int nonRepeat(int arr[]) {
		
		for(int i = 0; i<arr.length; i++) {
			int count = 0;
			for(int j = arr.length-1; j >= 0; j--) {
				if( arr[i] == arr[j])
					count ++;
			}
			if(count == 1)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter the Size of Array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the Elements: ");
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("the list of no is : ");
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("");
		
		int index = nonRepeat(arr);
		if(index != -1)
			System.out.print(arr[index]);
		else
			System.out.println("No non repeat no. exits");
		
	}
}
