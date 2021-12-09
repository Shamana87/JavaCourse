package com.javacourse.intro.summingLargeNumbers;

// The class gets two numbers as strings, sums them and returns the sum also as a String  
public class Summing {

	// The method does the addition
	public String calculation(String firstString, String secondString) {

		int firstDigit;
		int secondDigit;
		int helper;
		int carry = 0;
		String result;

		// The if statement equals the length of the two strings by filling the smaller
		// one with zeros
		if (firstString.length() > secondString.length()) {
			secondString = fillingAString(secondString, firstString.length());
		} else if (secondString.length() > firstString.length()) {
			firstString = fillingAString(firstString, secondString.length());
		}

		// Filling the resulting string with the same number of characters as the
		// strings being summed. The numbers in it doesn't matter, because they will be
		// overwritten.
		result = firstString;

		for (int i = firstString.length() - 1; i >= 0; i--) {

			// Converting the corresponding digits of the two strings in integers
			firstDigit = convertingCharToInt(firstString, i);
			secondDigit = convertingCharToInt(secondString, i);

			// Summing and handling the carry
			helper = firstDigit + secondDigit + carry;
			carry = 0;

			if (helper > 9) {
				carry = 1;
				helper -= 10;
			}

			// Inserting the result of the addition into the resulting String
			result = result.substring(0, i) + helper + result.substring(i + 1);
		}

		// Checking if there is a carry left after the addition. If so - adding it to
		// the result.
		if (carry > 0) {
			result = carry + result;
		}

		return result.toString();
	}

	// The method is filling a string with zeros infront till it reaches the desired
	// length
	private String fillingAString(String str, int i) {

		while (str.length() < i) {
			str = "0" + str;
		}
		return str;
	}

	// The method is converting a char from a string into an int. i shows the index
	// of the char in the string
	private int convertingCharToInt(String str, int i) {

		int intResult = Integer.valueOf(str.charAt(i) - 48);

		return intResult;
	}

}
