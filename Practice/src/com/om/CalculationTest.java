package com.om;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class CalculationTest {

	Calculation c;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c = new Calculation();
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	/*@Test(expected=Parameter.class)
	public void testAddEqual() {
		assertEquals(10, c.add(3, 7));
	}*/

	@Test
	public void testAddNotNull() {
		assertNotNull(c.add(7, 8));
	}
	@Test(expected=NullPointerException.class)
	public void testAddNullPointerException() {
		c = null;
		c.add(1, 2);
	}
}
