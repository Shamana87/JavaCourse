package com.javacourse.intro.arraysMedianTest;

import static org.junit.Assert.assertArrayEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

import com.javacourse.intro.arraysMedian.ArrayScanner;

public class ArrayScannerTest {

	ArrayScanner arrayScanner = new ArrayScanner();

	@Test
	public void testArrayScanner() {

		int[] result;
		int[] expected = { 5, 7, 2, 4, -1 };

		String data = "5, 7, 2, 4, -1";
		InputStream stdin = System.in;
		try {
			System.setIn(new ByteArrayInputStream(data.getBytes()));
			result = arrayScanner.readData();
		} finally {
			System.setIn(stdin);
		}

		assertArrayEquals(expected, result);
	}

}
