/**
 * 
 */
package com.vivek.practice.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vivek.practice.javaprogram.VowelChecking;

/**
 * @author VivekSharma
 * objective - test methods
 *
 */
class VowelCheckTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testVowelCheck() {
		VowelChecking vowelChecking =new  VowelChecking();
		assertEquals(true, vowelChecking.CheckVowel("vivek"));
		assertEquals(false, vowelChecking.CheckVowel("bdfghj"));
	}

}
