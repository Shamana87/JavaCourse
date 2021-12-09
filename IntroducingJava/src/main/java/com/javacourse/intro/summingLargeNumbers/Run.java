package com.javacourse.intro.summingLargeNumbers;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Run {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(Run.class);

		Summing summing = new Summing();

		try (Scanner scanner = new Scanner(System.in)) {

			logger.info("Enter the first number");
			String firstNumber = scanner.nextLine();

			logger.info("Enter the second number");
			String secondNumber = scanner.nextLine();

			logger.info("The sum of the numbers is: {}", summing.calculation(firstNumber, secondNumber));
		}

	}

}
