package com.javacourse.objects.bestHierarchyFigurePointCircleEllipseCurve;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle extends Ellipse {

	private double radius;

	private static final Logger logger = LoggerFactory.getLogger(Circle.class);

	// Constructors
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw() {
		logger.info("A circle was drawn with radius {}.", radius);
	}

	// Getters and Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
