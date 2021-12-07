package com.javacourse.intro.arrayProcessingTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import com.javacourse.intro.arrayProcessing.ArrayProcessing;
import com.javacourse.intro.arrayProcessing.MinElementIndexResult;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;

public class ArrayProcessingTest {

	@Test
	public void testGetMinElementIndex_checkingTheValue() {

		int anArray[] = { 3, 5, -4, 2, -3, -1, 0, 6 };

		MinElementIndexResult minValue = ArrayProcessing.getMinElementIndex(anArray);

		assertEquals(-4, minValue.getValue());

	}

	@Test
	public void testGetMinElementIndex_checkingTheIndex() {

		int anArray[] = { 3, 5, -4, 2, -3, -1, 0, 6 };
		List<Integer> expected = Arrays.asList(2);

		MinElementIndexResult minResult = ArrayProcessing.getMinElementIndex(anArray);

		Assert.assertEquals(expected, minResult.getRepeatedOnPositions());
	}

	@Test
	public void testGetMinElementIndex_checkingWithThreeElementsWithTheSameValue_expectedMoreThanOneLowestIndex() {

		int anArray[] = { 3, 5, -4, 2, -3, -4, 0, 6, -4 };
		List<Integer> expectedPositions = Arrays.asList(2, 5, 8);

		MinElementIndexResult minResult = ArrayProcessing.getMinElementIndex(anArray);

		Assert.assertEquals(expectedPositions, minResult.getRepeatedOnPositions());

	}

	@Test
	public void testSum() {

		int anArray[] = { 3, 5, -4, 2, -3, -1, 0, 6 };

		assertEquals(8, ArrayProcessing.sum(anArray));

	}

	@Test
	public void testPrint() {

		final Logger logger1 = (Logger) LoggerFactory.getLogger(ArrayProcessing.class);
		MemoryAppender memoryAppender = new MemoryAppender();
		memoryAppender.setContext((LoggerContext) LoggerFactory.getILoggerFactory());
		logger1.addAppender(memoryAppender);
		memoryAppender.start();		
		
		int anArray[] = { 3, 5, -4, 2, -3, -1, 0, 6 };
		
		ArrayProcessing.print(anArray);
		
		assertThat(memoryAppender.contains("3, 5, -4, 2, -3, -1, 0, 6", Level.INFO)).isTrue();
		
	}
	
	@Test
	public void testLargestSumSubarray() {
		
		int anArray[] = { 3, 5, -4, 4, -3, 1, 0, 6 };
		
		assertEquals(12, ArrayProcessing.largestSumSubarray(anArray));
	}

	

}
