package com.assignment1;

import java.util.Scanner;

public class Question6 {

	static Scanner sc = new Scanner(System.in);

	public static StringBuffer removeDuplicates(String s) {
		StringBuffer sb = new StringBuffer(s);
		StringBuffer str = new StringBuffer();
		
		for (int i = 0; i < sb.length(); i++) {
			int count = 0;
			for (int j = 0; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					count ++;
				} 
			}
			if(count == 1) {
				str.append(sb.charAt(i));
			}		
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.print("Enter the String");
		String value = sc.next();

		StringBuffer str = removeDuplicates(value);
		System.out.println(str);
	}
}
