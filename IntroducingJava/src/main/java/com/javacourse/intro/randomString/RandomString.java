package com.javacourse.intro.randomString;

// The class generates a given length string filled only with digits, lowercase or uppercase letters.
public class RandomString {

	// The method generates a random char, which can be only a digit, lowercase or
	// uppercase letter.
	private char generateRandomChar() {

		char c;
		int charNumber = 0;

		// Generate a random ASCII code only for a digit, uppercase or lowercase letter
		do {
			charNumber = (int) Math.round(Math.random() * 122);
		} while (charNumber < 48 || (charNumber > 57 && charNumber < 65)
				|| (charNumber > 90 && charNumber < 97) || charNumber > 122);

		c = (char) charNumber;
		
		return c;
	}

	// The method fills a given length string with chars
	public String fillingIn(int givenLength) {

		String result = "";

		for (int i = 0; i < givenLength; i++) {
			result = result + Character.toString(generateRandomChar());
		}

		return result;
	}

}
