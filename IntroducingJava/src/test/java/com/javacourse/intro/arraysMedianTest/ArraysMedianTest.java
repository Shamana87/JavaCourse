package com.javacourse.intro.arraysMedianTest;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.javacourse.intro.arraysMedian.ArraysMedian;

public class ArraysMedianTest {

	ArraysMedian arraysMedian = new ArraysMedian();

	@Test
	public void testArraySorting() {

		int anArray[] = { 4, 7, 1, -8, 15, -1 };
		int result[] = arraysMedian.arraySorting(anArray);
		int expected[] = { -8, -1, 1, 4, 7, 15 };

		Assert.assertArrayEquals(expected, result);
	}

	@Test
	public void testFindingTheMedian_evenNumberArrayElements() {

		int anArray[] = { 4, 7, 2, -5, -2, 0 };

		assertEquals(4, arraysMedian.findingTheMedian(anArray));

	}

	@Test
	public void testFindingTheMedian_unevenNumberArrayElements() {

		int anArray[] = { 4, 7, 2, 11, -5, -2, 0, 10, 1};

		assertEquals(5, arraysMedian.findingTheMedian(anArray));

	}

}
