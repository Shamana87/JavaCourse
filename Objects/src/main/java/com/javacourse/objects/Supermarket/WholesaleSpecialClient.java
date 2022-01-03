package com.javacourse.objects.Supermarket;

public class WholesaleSpecialClient extends WholesaleClient {

	private double wholesaleDiscount;

	// Constructors
	public WholesaleSpecialClient() {
		super();
	}

	public WholesaleSpecialClient(double wholesaleDiscount) {
		super();
		this.wholesaleDiscount = wholesaleDiscount;
	}

	// Setter and getter
	public double getWholesaleDiscount() {
		return wholesaleDiscount;
	}

	public void setWholesaleDiscount(double wholesaleDiscount) {
		this.wholesaleDiscount = wholesaleDiscount;
	}

}
