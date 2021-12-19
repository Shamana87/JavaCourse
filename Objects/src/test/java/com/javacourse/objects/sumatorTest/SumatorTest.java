package com.javacourse.objects.sumatorTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

import com.javacourse.objects.sumator.Sumator;

public class SumatorTest {
	
	Sumator sumator = new Sumator();

	@Test
	public void testSumIntegers() {
	
		Integer int1 = 12;
		Integer int2 = 57;
		Integer expected = 69;
				
		assertEquals(expected, sumator.sum(int1, int2));
		
	}
	
	@Test
	public void testSumFloats() {
	
		Float float1 = 12.5f;
		Float float2 = 4.8f;
		Float expected = 17.3f;
				
		assertEquals(expected, sumator.sum(float1, float2));
		
	}
	
	@Test
	public void testSumStrings() {
	
		String str1 = "17";
		String str2 = "26";
		String expected = "43.0";
				
		assertTrue(expected.equals(sumator.sum(str1, str2)));
		
	}
	
	@Test
	public void testSumBigDecimals() {
	
		BigDecimal bd1 = new BigDecimal("1.3434");
		BigDecimal bd2 = new BigDecimal("33.16");
		BigDecimal expected = new BigDecimal("34.5034");
				
		assertEquals(expected, sumator.sum(bd1, bd2));
		
	}
	
	@Test
	public void testSumBigIntegers() {
	
		BigInteger bint1 = new BigInteger("258");
		BigInteger bint2 = new BigInteger("89");
		BigInteger expected = new BigInteger("347");
				
		assertEquals(expected, sumator.sum(bint1, bint2));
		
	}

}
