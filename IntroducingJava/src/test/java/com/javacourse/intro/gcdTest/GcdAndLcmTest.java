package com.javacourse.intro.gcdTest;

import org.junit.Test;

import com.javacourse.intro.gcd.GcdAndLcm;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class GcdAndLcmTest {

	GcdAndLcm calculator;

	@Before
	public void setup() {
		calculator = new GcdAndLcm();
	}

	@Test
	public void testGcd() {

		assertEquals("testing with 18 and 48", 6, calculator.gcd(18, 48));

	}

	@Test
	public void testLcm() {

		assertEquals(144, calculator.lcm(18, 48));

	}
}
