package com.zx.x.SpringTest.Utils;

public class Calculator {
	
	private static int result;
	
	public void square(int n) {
		result = n * n;
	}
	
	public void squareRoot(int n) {
		for (;;){}
	}
	
	public void clear() {
		result = 0;
	}

	public int getResult() {
		return result;
	}
}
