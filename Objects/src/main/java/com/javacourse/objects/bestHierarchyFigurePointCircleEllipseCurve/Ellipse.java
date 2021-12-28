package com.javacourse.objects.bestHierarchyFigurePointCircleEllipseCurve;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ellipse extends Curve {

	private double minorAxis;
	private double maxiAxis;

	private static final Logger logger = LoggerFactory.getLogger(Ellipse.class);

	// Constructors
	public Ellipse() {
		super();
	}

	public Ellipse(double minorAxis, double maxiAxis) {
		super();
		this.minorAxis = minorAxis;
		this.maxiAxis = maxiAxis;
	}

	@Override
	public void draw() {
		logger.info("An ellipse was drawn with axes {} and {}.", minorAxis, maxiAxis);
	}

	// Getters and Setters
	public double getMinorAxis() {
		return minorAxis;
	}

	public void setMinorAxis(double minorAxis) {
		this.minorAxis = minorAxis;
	}

	public double getMaxiAxis() {
		return maxiAxis;
	}

	public void setMaxiAxis(double maxiAxis) {
		this.maxiAxis = maxiAxis;
	}

}
