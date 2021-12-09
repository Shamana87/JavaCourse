package com.javacourse.intro.arraysQuickSortTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javacourse.intro.arraysQuickSort.QuickSort;

public class QuickSortTest {

	@Test
	public void testCalculating() {
		
		QuickSort quickSort = new QuickSort();
		
		int anArray[] = {6, 2, -1, -5, 2, -8, 4, 7, 11, -15, 19};
		int expected[] = {-15, -8, -5, -1, 2, 2, 4, 6, 7, 11, 19};
		
		assertArrayEquals(expected, quickSort.calculating(anArray));
		
	}

}
