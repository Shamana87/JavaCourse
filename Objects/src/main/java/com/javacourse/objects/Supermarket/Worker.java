package com.javacourse.objects.Supermarket;

public interface Worker {

	public String name();

	public String employeeNumber();

	public double salaryCalculation(double workingHours, double wage);

	public int holidaysLeft(String workerNumber);

}
