package com.zx.x.SpringTest.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.zx.x.SpringTest.Utils.Calculator;

public class CalculatorTest {
	private static Calculator calculator = new Calculator();

	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test(timeout = 1000)
	public void testSquare() {
		calculator.square(5);
		assertEquals(25, calculator.getResult());
	}

	@Test(timeout = 1000)
	public void testSquareRoot() {
		calculator.squareRoot(6);
	}
}
