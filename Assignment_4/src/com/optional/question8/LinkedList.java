package com.optional.question8;

public class LinkedList {

	public class Node {
		private Employee data;
		private Node next, prev;

		public Node(Employee value) {
			data = value;
			next = prev = null;
		}
	}

	private Node head, tail;
	private int size;

	public LinkedList() {
		head = tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void addEmployee(int empId, String eName, Double salary) {

		Employee emp = new Employee(empId, eName, salary);
		Node newNode = new Node(emp);

		if (head == null && tail == null)
			head = tail = newNode;
		else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public void display() {
		Node travNode = head;
		while (travNode != null) {
			System.out.println(travNode.data);
			travNode = travNode.next;
		}
	}

	public Employee searchEmpName(String eName) {

		Node trav = head;
		while (trav != null) {
			if (trav.data.geteName().equalsIgnoreCase(eName))
				return trav.data;

			trav = trav.next;
		}
		return null;

	}

	public void deleteEmp(int empId) {
		Node trav = head;
		while (trav != null) {

			if (trav.data.getEmpId() == empId) {
				// only one node
				if (trav == head && trav == tail) {
					head = tail = null;

				} // first node
				else if (trav == head) {
					head = trav.next;
					trav.next.prev = null;

				}
				// delete last
				else if (trav == tail) {
					head = trav.next;
					trav.next.prev = null;
				}
				// middle node
				else {
					trav.prev.next = trav.next;
					trav.next.prev = trav.prev;

				}
				size--;
				return;
			}
			trav = trav.next;

		}

	}

	public void updateSalary(int empId, double salary) {

		Node trav = head;

		while (trav != null) {
			if (trav.data.getEmpId() == empId) {
				trav.data.setEsalary(salary);
				System.out.println("Salary Updated Sucessfully!!");
				return;
			}
			trav = trav.next;
		}
		System.out.println("Employee Not Found!!");
	}

	public void SortByEmployee() {
		if (head == null || head == tail)
			return;
		for (Node i = head; i.next != null; i = i.next) {
			for (Node j = head; j.next != null; j = j.next) {
				if (j.data.getEsalary() > j.next.data.getEsalary()) {
					Employee temp = j.data;
					j.data = j.next.data;
					j.next.data = temp;
				}
			}
		}
	}

}
