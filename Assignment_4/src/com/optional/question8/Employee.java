package com.optional.question8;

public class Employee {
	
	private int empId;
	private String eName;
	private Double esalary;
	
	
	public Employee(int empId, String eName, Double esalary) {
		this.empId = empId;
		this.eName = eName;
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee ID = " + empId + ", Employee Name = " + eName + ", Employee Salary = " + esalary;
	}
	
	

	public int getEmpId() {
		return empId;
	}

	public String geteName() {
		return eName;
	}

	public Double getEsalary() {
		return esalary;
	}

	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}
	
	
	
	

	
}
