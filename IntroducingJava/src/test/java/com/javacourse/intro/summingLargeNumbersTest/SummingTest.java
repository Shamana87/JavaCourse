package com.javacourse.intro.summingLargeNumbersTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javacourse.intro.summingLargeNumbers.Summing;

public class SummingTest {

	Summing summing = new Summing();
	
	@Test
	public void testSumming_equalLengthOfStrings() {
		
		String str1 = "7563";
		String str2 = "1093";
		String expected = "8656";
		
		assertEquals(expected, summing.calculation(str1, str2));
	}
	
	@Test
	public void testSumming_equalLengthOfStrings_expectingResultWithMoreDigits() {
		
		String str1 = "7563";
		String str2 = "2593";
		String expected = "10156";
		
		assertEquals(expected, summing.calculation(str1, str2));
	}
	
	@Test
	public void testSumming_oneBigNumberAndOneSmall() {
		
		String str1 = "3999999";
		String str2 = "8";
		String expected = "4000007";
		
		assertEquals(expected, summing.calculation(str1, str2));
	}
		
	@Test
	public void testSumming_oneBigNumberAndOneSmall_expectingResultWithMoreDigits() {
		
		String str1 = "9999";
		String str2 = "8";
		String expected = "10007";
		
		assertEquals(expected, summing.calculation(str1, str2));
	}
	
	@Test
	public void testSumming_theSecondNumberIsTheBiggerOne() {
		
		String str1 = "5";
		String str2 = "99998";
		String expected = "100003";
		
		assertEquals(expected, summing.calculation(str1, str2));
	}
}
