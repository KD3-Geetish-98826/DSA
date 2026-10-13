package com.optional.question8;

import java.util.Scanner;

public class LinkedListMain {

	static Scanner sc = new Scanner(System.in);

	public static int menuList() {
		System.out.println("\n0. Exit");
		System.out.println("1. Add employee");
		System.out.println("2. Display all employees");
		System.out.println("3. Search employee by name");
		System.out.println("4. Delete employee by empid");
		System.out.println("5. Update salary of employee");
		System.out.println("6. Sort employees by salary");
		System.out.print("\nEnter your Choice: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

		int choice;
		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				System.out.print("\nEnter the Employee ID: ");
				int empId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the Employee Name: ");
				String eName = sc.nextLine();
				System.out.print("Enter the Employee Salary: ");
				Double esalary = sc.nextDouble();
				
				list.addEmployee(empId, eName, esalary);
				System.out.println("\nAdded Employee details Sucessfully!!");
					
				break;
			case 2:
				//format
				list.display();
				break;
			case 3:
				System.out.print("Enter the Employee Name: ");
				sc.nextLine();
				String ename = sc.nextLine();
				Employee emp = list.searchEmpName(ename);

				if (emp == null)
				    System.out.println("Employee Not found");
				else
				    System.out.println(emp);
				break;
			case 4:
				System.out.print("Enter the Employee Id you want to remove: ");
				list.deleteEmp(sc.nextInt());
				System.out.println("\nDeleted Sucessfully!!");
				break;
			case 5:
				System.out.print("Enter the Employee Id you want to Update the Salary: ");
				int empid = sc.nextInt();
				System.out.print("Enter the Updated Salary: ");
				double salary = sc.nextDouble();
				list.updateSalary(empid, salary);
				break;
			case 6:
				
				list.SortByEmployee();
				list.display();
				break;
			default:
				System.out.println("Invalid Choice!!");
				break;
			}

		}
		System.out.println("Program exiting Sucessfull!!");

	}

}
