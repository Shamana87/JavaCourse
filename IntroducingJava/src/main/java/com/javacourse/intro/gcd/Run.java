package com.javacourse.intro.gcd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Run {

	private static final Logger logger = LoggerFactory.getLogger(Run.class);
	
	public static void main(String[] args) {
		
		GcdAndLcm calculator = new GcdAndLcm();
		
		logger.info("The greatest common devider is: {}", calculator.gcd(18, 48));
		logger.info("Least common multiple is: {}", calculator.lcm(18, 48));


	}

}
