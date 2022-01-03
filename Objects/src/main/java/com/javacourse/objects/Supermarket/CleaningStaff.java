package com.javacourse.objects.Supermarket;

public class CleaningStaff extends Supermarket implements Worker {

	private double bonusExtraEffort;

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
		// and the bonusExtraEffort
		return 0;
	}

	public int holidaysLeft(String workerNumber) {
		// Calculating how many holidays has the employee left till the end of the year
		return 0;
	}

	// Constructors
	public CleaningStaff() {
		super();
	}

	public CleaningStaff(double bonusExtraEffort) {
		super();
		this.bonusExtraEffort = bonusExtraEffort;
	}

	// Setter and getter
	public double getBonusExtraEffort() {
		return bonusExtraEffort;
	}

	public void setBonusExtraEffort(double bonusExtraEffort) {
		this.bonusExtraEffort = bonusExtraEffort;
	}

}
