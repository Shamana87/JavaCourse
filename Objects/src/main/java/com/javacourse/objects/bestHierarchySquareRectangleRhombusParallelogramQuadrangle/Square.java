package com.javacourse.objects.bestHierarchySquareRectangleRhombusParallelogramQuadrangle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square extends Rectangle {

	private static final Logger logger = LoggerFactory.getLogger(Quadrangle.class);

	private double side;

	// Constructors
	public Square() {
		super();
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public void draw() {
		logger.info("A square with side {} was drawn.", side);
	}

	// Getters and Setters
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

}
