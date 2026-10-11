package com.question2;

public class DecStack {

	private int arr[];
	private final int SIZE;
	private int top;

	public DecStack(int size) {
		SIZE = size;
		top = SIZE;
		arr = new int[SIZE];
	}

	public void push(int value) {
		if(isFull())
			System.out.println("The stack is Full");
		else {
			top --;
			arr[top] = value;
		}
	}
	
	public int pop() {
		int temp = SIZE;
		if(isEmpty())
			System.out.println("Stack is Empty");
		else {
			temp = arr[top];
			top ++;
		}
		return temp;
	}
	public int peek() {
		int temp = SIZE;
		if(isEmpty())
			System.out.println("Stack is Empty");
		else {
			temp = arr[top];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return top == SIZE;
	}

	public boolean isFull() {
		return top == 0;
	}

}
