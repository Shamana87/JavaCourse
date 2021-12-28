package com.javacourse.objects.bestHierarchyFigurePointCircleEllipseCurve;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Curve extends Point {

	private Point point1;
	private Point point2;

	private static final Logger logger = LoggerFactory.getLogger(Curve.class);

	// Constructors
	public Curve() {
		super();
	}

	public Curve(Point point1, Point point2) {
		super();
		this.point1 = point1;
		this.point2 = point2;
	}

	@Override
	public void draw() {
		logger.info("A curve was drawn from {} to {}.", point1, point2);
	}

	// Getters and Setters
	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

}
