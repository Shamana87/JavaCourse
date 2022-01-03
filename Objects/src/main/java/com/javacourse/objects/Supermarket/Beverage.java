package com.javacourse.objects.Supermarket;

public class Beverage extends FoodProduct {

	private int pack; // Shows how many bottles are in a tray/pack

	// Constructors
	public Beverage() {
		super();
	}

	public Beverage(int pack) {
		super();
		this.pack = pack;
	}

	// Setter and getter
	public int getPack() {
		return pack;
	}

	public void setPack(int pack) {
		this.pack = pack;
	}

}
