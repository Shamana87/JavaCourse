package com.javacourse.objects.Supermarket;

public class Cashier extends Supermarket implements Worker {

	private double monthlyBalance; // Sum of the ammounts of all the mistakes for the month

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
		// Calculating the salary of the employee by given monthly working hours, wage
		// and the monthlyBalance
		return 0;
	}

	public int holidaysLeft(String workerNumber) {
		// Calculating how many holidays has the employee left till the end of the year
		return 0;
	}

	// Constructors
	public Cashier() {
		super();
	}

	public Cashier(double monthlyBalance) {
		super();
		this.monthlyBalance = monthlyBalance;
	}

	// Setter and getter
	public double getMonthlyBalance() {
		return monthlyBalance;
	}

	public void setMonthlyBalance(double monthlyBalance) {
		this.monthlyBalance = monthlyBalance;
	}

}
