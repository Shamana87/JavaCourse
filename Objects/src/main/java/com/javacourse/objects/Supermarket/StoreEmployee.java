package com.javacourse.objects.Supermarket;

public class StoreEmployee extends Supermarket implements Worker {

	private String department;

	// Implementation of inherited methods
	public String name() {
		// Setting the name of the employee
		return null;
	}

	public String employeeNumber() {
		// Generating a unique number for the employee
		return null;
	}

	public double salaryCalculation(double workingHours, double wage) {
		// Calculating the salary of the employee by given monthly working hours and wage
		return 0;
	}

	public int holidaysLeft(String workerNumber) {
		// Calculating how many holidays has the employee left till the end of the year
		return 0;
	}

	// Constructors
	public StoreEmployee() {
		super();
	}

	public StoreEmployee(String department) {
		super();
		this.department = department;
	}

	// Setter and getter
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
