package com.testing.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdditionTest {

	Addition addition;
	
	@BeforeAll
    static void initAll() {
		System.out.println("in initAll");
    }

    @BeforeEach
    void init() {
		addition = new Addition();
    }

	@Test
	void test() {
		assertEquals(2, addition.add(1, 1));
	}
	
	@AfterEach
    void tearDown() {
		System.out.println("cleaning up...");
    }

    @AfterAll
    static void tearDownAll() {
		System.out.println("in tearDownAll");
    }

}
