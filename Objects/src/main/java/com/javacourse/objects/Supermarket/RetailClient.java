package com.javacourse.objects.Supermarket;

// We assume that the client will buy products only at our store from the chain
public class RetailClient extends Supermarket implements Client {

	// Implementation of inherited methods
	public String name() {
		// Setting the name of the client
		return null;
	}

	public double yearlyTurnover(String year) {
		// Calculating the turnover that this customer is making for the year
		return 0;
	}

	// Constructor
	public RetailClient() {
		super();
	}

}
