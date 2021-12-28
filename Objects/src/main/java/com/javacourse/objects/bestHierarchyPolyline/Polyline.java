package com.javacourse.objects.bestHierarchyPolyline;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Polyline extends Line {

	private Point checkpoints[];

	private static final Logger logger = LoggerFactory.getLogger(Polyline.class);

	//Constructors
	public Polyline() {
		super();
	}

	public Polyline(Point ... checkpoints) {
		super();
		this.checkpoints = checkpoints;
	}

	@Override
	public void draw() {
		logger.info("A polyline was drawn with points {}", Arrays.toString(checkpoints));

	}

	//Getters and Setters
	public Point[] getCheckpoints() {
		return checkpoints;
	}

	public void setCheckpoints(Point ...points ) {
		this.checkpoints = points;
	}

}
