package com.javacourse.intro.hangman;

import java.util.Arrays;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hangman {

	char[] spelled;
	char[] guessed;
	int lives = 5;
	char guess;
	boolean win;

	Logger logger = LoggerFactory.getLogger(Hangman.class);

	public void game(String word) {

		// Setting the length of the char arrays.
		spelled = new char[word.toCharArray().length];
		guessed = new char[word.toCharArray().length];

		// guessed array keeps the letters that are guessed and _ for the non-guessed
		// letters. spelled array is for checking the guesses
		for (int i = 0; i < guessed.length; i++) {
			guessed[i] = 95;
			spelled[i] = word.charAt(i);
		}

		try (Scanner scanner = new Scanner(System.in);) {

			// The loop checks for the entered letters till win or game over
			while (lives > 0 && win == false) {

				status(guessed);
				logger.info("Try to guess a letter:");
				guess = scanner.nextLine().charAt(0);

				if (checkAvailability(guess, spelled)) {
					logger.info("Well done!");
					win = winCondition(guessed);
				} else {
					lives--;
					logger.info("The word doesn't contain the letter. You have {} lives more.", lives);
				}

			}
		}

		if (win == true) {
			logger.info("Congratulations! The word was: " + Arrays.toString(spelled));
		} else {
			logger.info("Game Over! The word was: " + Arrays.toString(spelled));
		}

	}

	// The method checks if the char can be found in the char[]. If true making the
	// letter as guessed
	private boolean checkAvailability(char c, char[] spelledWord) {
		boolean available = false;
		for (int i = 0; i < spelledWord.length; i++) {
			if (Character.toLowerCase(c) == Character.toLowerCase(spelledWord[i])) {
				available = true;
				guessed[i] = spelled[i];
			}
		}
		return available;
	}

	// The method prints the actual status of the guessed letters
	private void status(char[] ch) {

		for (char c : ch) {
			System.out.print(c + " ");
		}
		System.out.print("\n");
	}

	// The method checks if every letter was guessed
	private boolean winCondition(char[] charArray) {
		for (char c : charArray) {
			if (c == 95) {
				return false;
			}
		}
		return true;
	}

}
