package com.javacourse.objects.Supermarket;

public class StoreManager extends DepartmentManager {

	private boolean hasKeys;
	private double bonusForAchievingTarget;

	// Constructors
	public StoreManager() {
		super();
	}

	public StoreManager(boolean hasKeys, double bonusForAchievingTarget) {
		super();
		this.hasKeys = hasKeys;
		this.bonusForAchievingTarget = bonusForAchievingTarget;
	}

	// Setters and getters
	public boolean isHasKeys() {
		return hasKeys;
	}

	public void setHasKeys(boolean hasKeys) {
		this.hasKeys = hasKeys;
	}

	public double getBonusForAchievingTarget() {
		return bonusForAchievingTarget;
	}

	public void setBonusForAchievingTarget(double bonusForAchievingTarget) {
		this.bonusForAchievingTarget = bonusForAchievingTarget;
	}

}
