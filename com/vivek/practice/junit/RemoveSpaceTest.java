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

import com.vivek.practice.javaprogram.RemoveSpaceSolution;

/**
 * @author VivekSharma
 *
 */
class RemoveSpaceTest {

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
	void testRemoveSpace() {
		RemoveSpaceSolution removeSpaceSolution = new RemoveSpaceSolution();
		assertEquals("vivek",removeSpaceSolution.RemoveSpace("  v i   v ek") );
		assertEquals("rohit",removeSpaceSolution.RemoveSpace("roh i   t    ") );
	}

}
