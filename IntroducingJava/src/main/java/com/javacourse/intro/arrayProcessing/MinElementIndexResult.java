package com.javacourse.intro.arrayProcessing;

import java.util.ArrayList;
import java.util.List;


// The class is introducing a pair of variables that the method getMinElementIndex will return.  
public class MinElementIndexResult {

	private List<Integer> repeatedOnPositions = new ArrayList<>();
	private int value;


	public MinElementIndexResult(List<Integer> repeatedOnPositions, int value) {
		super();
		this.repeatedOnPositions = repeatedOnPositions;
		this.value = value;
	}


	public List<Integer> getRepeatedOnPositions() {
		return repeatedOnPositions;
	}

	public int getValue() {
		return value;
	}
	
}
