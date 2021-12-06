package com.javacourse.intro.gcd;

public class GcdAndLcm {

	public GcdAndLcm() {
		super();
	}

	// Method for calculating the greatest common devider
	public int gcd(int a, int b) {
		do {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		} while (a != b);

		return a;
	}

	// Method for calculating the least common multiple
	public int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
