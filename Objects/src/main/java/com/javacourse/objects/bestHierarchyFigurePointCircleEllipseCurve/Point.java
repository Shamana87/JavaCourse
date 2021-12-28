package com.javacourse.objects.bestHierarchyFigurePointCircleEllipseCurve;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Point extends Figure {

	private double x;
	private double y;

	private static final Logger logger = LoggerFactory.getLogger(Point.class);

	// Constructors
	public Point() {
		super();
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		logger.info("A point with coordinates x={} and y={} was drawn.", x, y);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// Getters and Setters
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
