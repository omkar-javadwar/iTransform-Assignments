package com.testing.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	@Test
	void testFindMinMax() {
		MinMaxFinder minMaxFinder = new MinMaxFinder();
		int[] x = { 56, 34, 7, 3, 54, 3, 34, 34, 52 };
		int[] res = { 3, 56 };
		assertArrayEquals(res, minMaxFinder.findMinMax(x));
	}
}
