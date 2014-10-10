package com.zx.x.SpringTest.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.zx.x.SpringTest.Utils.Calculator;

@RunWith(Parameterized.class)
public class CalculatorSquareTest {
	
	private static Calculator calculator = new Calculator();
	private int param;
	private int result;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{2, 4}, {3, 9}, {-3, 9}
		});
	}
	
	public CalculatorSquareTest(int param, int result) {
		this.param = param;
		this.result = result;
	}

	@Test
	public void testSquare() {
		calculator.square(param);
		assertEquals(result, calculator.getResult());
	}

}
