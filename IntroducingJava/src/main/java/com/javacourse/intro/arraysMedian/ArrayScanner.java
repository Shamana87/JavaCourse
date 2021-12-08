package com.javacourse.intro.arraysMedian;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// The class is returning an int[] read from the console
public class ArrayScanner {

	private static final Logger logger = LoggerFactory.getLogger(ArrayScanner.class);

	// The method reads data from the console and returns it as an array
	public int[] readData() {
		return transformInAnArray(readingData());
	}
	
	// The method is reading data from the console
	private String readingData() {

		String line;

		try (Scanner scanner = new Scanner(System.in)) {

			logger.info("Please enter an array of integers divided by commas");

			line = scanner.nextLine().replaceAll("\\s+", "");
		}
		return line;
	}
	
	// The method is transforming the read string to an int[]
	private int[] transformInAnArray(String data) {

		int[] readArray = {};

		try {
			List<Integer> list = Arrays.stream(data.split(",")).map(Integer::parseInt).collect(Collectors.toList());

			readArray = new int[list.size()];

			for (int i = 0; i < list.size(); i++) {
				readArray[i] = list.get(i);
			}

		} catch (NumberFormatException e) {
			logger.error(e.toString());
		}
		return readArray;
	}

}
