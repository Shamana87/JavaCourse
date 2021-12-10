package com.javacourse.intro.randomString;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Run {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(Run.class);
		RandomString randomString = new RandomString();
		
		int wantedLength = 0;
		
		try (Scanner scanner = new Scanner(System.in)) {

			logger.info("How long string do you need? Please enter an integer");
			wantedLength = scanner.nextInt();
		} catch (InputMismatchException e) {
			logger.error(e.toString());
		}

		logger.info("Here is your string: {}", randomString.fillingIn(wantedLength));
		
	}

}
