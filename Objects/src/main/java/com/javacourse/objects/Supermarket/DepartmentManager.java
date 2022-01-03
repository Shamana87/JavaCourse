package com.javacourse.objects.Supermarket;

public class DepartmentManager extends StoreEmployee {

	private double turnoverTarget;

	// Constructors
	public DepartmentManager() {
		super();
	}

	public DepartmentManager(double turnoverTarget) {
		super();
		this.turnoverTarget = turnoverTarget;
	}

	// Setter and getter
	public double getTurnoverTarget() {
		return turnoverTarget;
	}

	public void setTarget(double turnoverTarget) {
		this.turnoverTarget = turnoverTarget;
	}

}
