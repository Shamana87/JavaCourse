package com.javacourse.objects.Supermarket;

public class FrozenProducts extends FoodProduct {

	private boolean needToBeFrozen;

	// Constructors
	public FrozenProducts() {
		super();
	}

	public FrozenProducts(boolean needToBeFrozen) {
		super();
		this.needToBeFrozen = needToBeFrozen;
	}

	// Setter and getter
	public boolean isNeedToBeFrozen() {
		return needToBeFrozen;
	}

	public void setNeedToBeFrozen(boolean needToBeFrozen) {
		this.needToBeFrozen = needToBeFrozen;
	}

}
