package com.question1;


public class Queue {

	private int arr[];
	private final int SIZE;
	private int front, rear;

	public Queue(int size) {
		front = rear = 0;
		SIZE = size;
		arr = new int[SIZE];
	}

	public void offer(int value) {
		if (isFull())
			System.out.println("The Queue is full!!");
		else {
			arr[rear] = value;
			rear ++;
		}
	}

	public int poll() {
		int temp = -1;
		if (isEmpty())
			System.out.println("Queue is Empty");
		else {
			temp = arr[front];
			front++;
		}
		return temp;
	}

	public int element() {
		int temp = -1;
		if (isEmpty())
			System.out.println("Queue is Empty");
		else {
			temp = arr[front];
		}
		return temp;
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public boolean isFull() {
		return rear == SIZE ;
	}
}

