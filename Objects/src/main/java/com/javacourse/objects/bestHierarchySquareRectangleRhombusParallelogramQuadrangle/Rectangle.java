package com.javacourse.objects.bestHierarchySquareRectangleRhombusParallelogramQuadrangle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle extends Parallelogram {

	private static final Logger logger = LoggerFactory.getLogger(Quadrangle.class);

	private double side1;
	private double side2;

	// Constructors
	public Rectangle() {
		super();
	}

	public Rectangle(double side1, double side2) {
		super();
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public void draw() {
		logger.info("A rectangle was drawn with sides {} and {}.", side1, side2);
	}

	// Getters and Setters
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

}
