package com.javacourse.intro.arraysMedian;

// The class finds the index of the median element of an array
public class ArraysMedian {

	// The method returns the given array sorted
	public int[] arraySorting(int[] array) {

		int substitute;

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[i]) {
					substitute = array[i];
					array[i] = array[j];
					array[j] = substitute;
				}
			}
		}
		return array;
	}

	// The method returns the index of the median element of the array
	public int findingTheMedian(int[] array) {

		int median;

		if (array.length % 2 == 0) {
			median = (array.length / 2) + 1;
		} else {
			median = array.length / 2 + 1;
		}
		return median;
	}

}
