package com.javacourse.intro.arrayReverse;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javacourse.intro.arraysMedian.ArrayScanner;

public class Run {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(Run.class);

		ArrayScanner arrayScanner = new ArrayScanner();
		ArrayReverse arrayReverse = new ArrayReverse();

		logger.info("The reversed array is: {}", Arrays.toString(arrayReverse.reverse(arrayScanner.readData())));
	}

}
