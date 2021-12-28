package com.javacourse.objects.bestHierarchySquareRectangleRhombusParallelogramQuadrangle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rhombus extends Parallelogram {

	private static final Logger logger = LoggerFactory.getLogger(Quadrangle.class);

	private double side;
	private int angle1;
	private int angle2;

	// Constructors
	public Rhombus() {
		super();
	}

	public Rhombus(double side, int angle1, int angle2) {
		super();
		this.side = side;
		this.angle1 = angle1;
		this.angle2 = angle2;
	}

	@Override
	public void draw() {
		logger.info("A rhombus was drawn with side {} and angles {}, {}.", side, angle1, angle2);
	}

	// Getters and Setters
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public int getAngle1() {
		return angle1;
	}

	public void setAngle1(int angle1) {
		this.angle1 = angle1;
	}

	public int getAngle2() {
		return angle2;
	}

	public void setAngle2(int angle2) {
		this.angle2 = angle2;
	}

}
