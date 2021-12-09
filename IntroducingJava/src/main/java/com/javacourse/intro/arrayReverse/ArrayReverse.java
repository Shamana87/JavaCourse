package com.javacourse.intro.arrayReverse;

// The class reverses the order of an int[]
public class ArrayReverse {

	// The method reverses the order of an int[]
	public int[] reverse(int[] anArray) {

		int helper;

		for (int i = 0; i < anArray.length - i; i++) {
			helper = anArray[i];
			anArray[i] = anArray[(anArray.length - 1) - i];
			anArray[(anArray.length - 1) - i] = helper;
		}

		return anArray;
	}
}
