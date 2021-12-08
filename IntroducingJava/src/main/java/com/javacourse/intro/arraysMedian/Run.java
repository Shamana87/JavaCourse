package com.javacourse.intro.arraysMedian;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Run {

	public static void main(String[] args) {

		ArrayScanner arrayScanner = new ArrayScanner();
		ArraysMedian arraysMedian = new ArraysMedian();

		final Logger logger = LoggerFactory.getLogger(Run.class);

		int anArray[] = arrayScanner.readData();

		logger.info("The {} element of the array {} is its median.", arraysMedian.findingTheMedian(anArray),
				Arrays.toString(arraysMedian.arraySorting(anArray)));

	}

}
