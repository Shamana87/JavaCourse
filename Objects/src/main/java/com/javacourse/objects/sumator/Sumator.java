package com.javacourse.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

// sum methods for summing two Integers, Floats, Strings, BigDecimal and BigInteger objects
public class Sumator {

	
	public Integer sum(Integer firstNum, Integer secondNum) {
		return firstNum + secondNum;
	}
	
	
	public Float sum(Float firstNum, Float secondNum) {
		return firstNum + secondNum;
	}
	
	
	public String sum(String firstNum, String secondNum) {
		
		Double first = Double.parseDouble(firstNum);
		Double second = Double.parseDouble(secondNum);
		
		return String.valueOf(first + second);
	}
	
	
	public BigDecimal sum(BigDecimal firstNum, BigDecimal secondNum) {	
		return firstNum.add(secondNum);
	}
	
	
	public BigInteger sum(BigInteger firstNum, BigInteger secondNum) {	
		return firstNum.add(secondNum);
	}

}
