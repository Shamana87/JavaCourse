package com.javacourse.objects.bestHierarchySquareRectangleRhombusParallelogramQuadrangle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quadrangle extends Figure {

	private static final Logger logger = LoggerFactory.getLogger(Quadrangle.class);

	private double side1;
	private double side2;
	private double side3;
	private double side4;
	private int angle1;
	private int angle2;
	private int angle3;
	private int angle4;

	// Constructors
	public Quadrangle() {
	}

	public Quadrangle(double side1, double side2, double side3, double side4, int angle1, int angle2, int angle3,
			int angle4) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.angle1 = angle1;
		this.angle2 = angle2;
		this.angle3 = angle3;
		this.angle4 = angle4;
	}

	@Override
	public void draw() {

		if (angle1 + angle2 + angle3 + angle4 == 360) {
			logger.info("A figure with 4 sides and 4 angles was drawn.");
		} else {
			logger.error("With these data a quadrangle can't be drawn.");
		}
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

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getSide4() {
		return side4;
	}

	public void setSide4(double side4) {
		this.side4 = side4;
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

	public int getAngle3() {
		return angle3;
	}

	public void setAngle3(int angle3) {
		this.angle3 = angle3;
	}

	public int getAngle4() {
		return angle4;
	}

	public void setAngle4(int angle4) {
		this.angle4 = angle4;
	}

}
