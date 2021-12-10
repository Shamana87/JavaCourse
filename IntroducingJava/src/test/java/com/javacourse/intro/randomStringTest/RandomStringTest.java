package com.javacourse.intro.randomStringTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javacourse.intro.randomString.RandomString;

public class RandomStringTest {

	RandomString randomString = new RandomString();

	@Test
	public void testRandomString_checkingLength() {

		int expected = 15;

		assertEquals(expected, randomString.fillingIn(expected).length());

	}

	@Test
	public void testRandomString_invalidCharacter() {

		String str = randomString.fillingIn(50);
		char c;
		boolean result = false;

		for (int i = 0; i < str.length(); i++) {

			c = str.charAt(i);
			if (c < 48 || (c > 57 && c < 65) || (c > 90 && c < 97) || c > 122) {
				result = true;
			}
		}

		assertFalse(result);
	}

}
