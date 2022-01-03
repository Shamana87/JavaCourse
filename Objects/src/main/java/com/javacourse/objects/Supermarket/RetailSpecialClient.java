package com.javacourse.objects.Supermarket;

public class RetailSpecialClient extends RetailClient {

	private double retailDiscount;

	// Constructors
	public RetailSpecialClient() {
		super();
	}

	public RetailSpecialClient(double retailDiscount) {
		super();
		this.retailDiscount = retailDiscount;
	}

	// Setter and getter
	public double getRetailDiscount() {
		return retailDiscount;
	}

	public void setDiscount(double retailDiscount) {
		this.retailDiscount = retailDiscount;
	}

}
