package com.question3;

public class CircularQueue {

	private int arr[];
	private final int SIZE;
	private int front, rear;
	int count;

	public CircularQueue(int size) {
		front = rear = -1;
		SIZE = size;
		arr = new int[SIZE];
		count = 0;
	}

	public void offer(int value) {
		if (isFull())
			System.out.println("The Queue is full!!");
		else {
			rear = (rear + 1) % SIZE;
			arr[rear] = value;
			count ++;
		}
	}

	public int poll() {
		int temp = -1;

		if (isEmpty())
			System.out.println("Stack is Empty");
		else {
			temp = arr[(front + 1) % SIZE];
			front = (front + 1) % SIZE;
			count--;
		}
		return temp;
	}

	public int element() {
		int temp = -1;
		if (isEmpty())
			System.out.println("Stack is Empty");
		else {
			temp = arr[(front + 1) % SIZE];
		}
		return temp;
	}

	public boolean isEmpty() {
		return front == rear && rear == -1 && count == 0;
	}

	public boolean isFull() {
		return (front == -1 && rear == SIZE - 1 && count == SIZE) || (front == rear && rear != -1 && count == SIZE);
	}
}
