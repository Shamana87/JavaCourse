package com.javacourse.objects.Supermarket;

import java.util.Date;

public class FoodProduct extends Supermarket implements Product {

	private Date expiryDate;

	// Implementation of inherited methods
	public String name() {
		// Setting the name of the product
		return null;
	}

	public String articleNumber() {
		// Setting the art.Number of the product
		return null;
	}

	public double retailPrice() {
		// Setting the retail price of the product
		return 0;
	}

	public double wholesalePrice() {
		// Setting the wholesale price of the product
		return 0;
	}

	// Constructors
	public FoodProduct() {
		super();
	}

	public FoodProduct(Date expiryDate) {
		super();
		this.expiryDate = expiryDate;
	}

	// Setter and getter
	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

}
