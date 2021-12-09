package com.javacourse.intro.arraysQuickSort;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javacourse.intro.arraysMedian.ArrayScanner;

public class Run {

	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(Run.class);
		
		QuickSort quickSort = new QuickSort();
		ArrayScanner arrayScanner = new ArrayScanner();
		
		logger.info(Arrays.toString(quickSort.calculating(arrayScanner.readData())));

	}

}
