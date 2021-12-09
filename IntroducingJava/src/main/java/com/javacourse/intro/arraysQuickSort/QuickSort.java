package com.javacourse.intro.arraysQuickSort;

// The class sorts an int[] with quicksort
public class QuickSort {
	
	// The method changes the values of the array elements
	private void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	// The method finds the correct place of the pivot element in an array
	private int partition(int[] arr, int low, int high)	{
	    
	    int pivot = arr[high]; 
	    int i = (low - 1); 
	
	    for(int j = low;j<=high-1;j++) {
	    	if (arr[j] < pivot) {
	    		i++;
	    		swap(arr, i, j);
	    	}
	    }

	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	
	// The method is recursive, divides the array in partitions and sorts the elements by calling the partition method
	private void quickSort(int[] arr, int low, int high)	{
	    
		if (low < high) {
	        int pi = partition(arr, low, high);
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}
	
	// The method runs the whole Quicksort mechanism with a given array
	public int[] calculating(int[] oneArray) {
		
		quickSort(oneArray, 0, oneArray.length-1);
		
		return oneArray;
	}
	

}
