package com.javacourse.intro.arrayProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayProcessing {

	private static final Logger logger = LoggerFactory.getLogger(ArrayProcessing.class);

	public static void main(String[] args) {

		int oneArray[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		MinElementIndexResult minResult = getMinElementIndex(oneArray);

		logger.info("The index of the element(s) with the lowest value is: {} and it's value is {}", 
													minResult.getRepeatedOnPositions().toString(), minResult.getValue());
		logger.info("The sum of the elements in the array is: {}", sum(oneArray));
		print(oneArray);
		logger.info("The largest sum of the elements of a contiguous subarray is: {}", largestSumSubarray(oneArray));

	}

	// The method returns the index of the element with the lowest value
	public static MinElementIndexResult getMinElementIndex(int[] array) {

		List<Integer> result = new ArrayList<>();
		int min = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[min]) {
				min = i;
				result.removeAll(result);
				result.add(min);
			} else {
				if (array[i] == array[min]) {
					result.add(i);
				}
			}
		}

		return new MinElementIndexResult(result, array[min]);
	}

	// The method returns the sum of all the elements in the array
	public static int sum(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum;
	}

	// The method prints all the elements in the array
	public static void print(int[] array) {
		
		logger.info("The elements of the array are: {}", Arrays.toString(array));
		
	}
	
	// The method finds out the contiguous subarray with the largest sum and prints the sum
	public static int largestSumSubarray(int[] array) {
		
		int subarraySumMax = 0;
		int subarray[];
		
		for(int i = 1; i<=array.length; i++) {
			for(int j = 0; j <= array.length-i; j++) {
					subarray = Arrays.copyOfRange(array, j, j+i);
					if(sum(subarray) > subarraySumMax) {
						subarraySumMax = sum(subarray);
					}					
			}
		}
		return subarraySumMax;
	}
	
}
