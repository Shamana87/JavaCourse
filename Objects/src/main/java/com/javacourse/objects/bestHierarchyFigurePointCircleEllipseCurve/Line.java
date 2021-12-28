package com.javacourse.objects.bestHierarchyFigurePointCircleEllipseCurve;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Line extends Point {

	private double length;

	private static final Logger logger = LoggerFactory.getLogger(Line.class);

	// Constructors
	public Line() {
		super();
	}

	public Line(double length) {
		super();
		this.length = length;
	}

	@Override
	public void draw() {
		logger.info("A line with length {} was drawn.", length);
	}

	// Getters and Setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

}
