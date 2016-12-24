package com.din.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase {

	@Test
	public static void main(String[] args) {
		long a = 10;
		long b = 20;
		Addition add = new Addition();
		long expected = 30;
		long result = add.addMethod(a, b);
		assertEquals(expected, result);
	}

}
