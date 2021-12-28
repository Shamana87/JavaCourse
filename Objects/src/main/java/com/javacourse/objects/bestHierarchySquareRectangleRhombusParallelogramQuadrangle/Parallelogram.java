package com.javacourse.objects.bestHierarchySquareRectangleRhombusParallelogramQuadrangle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Parallelogram extends Quadrangle {

	private static final Logger logger = LoggerFactory.getLogger(Quadrangle.class);

	private double side1;
	private double side2;
	private int angle1;
	private int angle2;

	// Constructors
	public Parallelogram() {
		super();
	}

	public Parallelogram(double side1, double side2, int angle1, int angle2) {
		this.side1 = side1;
		this.side2 = side2;
		this.angle1 = angle1;
		this.angle2 = angle2;
	}

	@Override
	public void draw() {
		logger.info("A parallelogram was drawn with sides {}, {} and angles {}, {}.", side1, side2, angle1, angle2);
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
