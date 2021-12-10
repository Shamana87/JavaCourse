package com.javacourse.intro.hangman;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Run {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(Run.class);

		Hangman hangman = new Hangman();

		try (Scanner scanner = new Scanner(System.in);) {

			logger.info("Enter a word");
			hangman.game(scanner.nextLine());

		}
	}

}
