package com.javacourse.intro.arrayReverseTest;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.javacourse.intro.arrayReverse.ArrayReverse;

public class ArrayReverseTest {

	@Test
	public void test() {

		ArrayReverse arrayReverse = new ArrayReverse();

		int anArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int expected[] = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		assertArrayEquals(expected, arrayReverse.reverse(anArray));
	}

}
