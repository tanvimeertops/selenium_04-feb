package com.junit;

import org.junit.Before;
import org.junit.Test;

public class JunitException {
	ArithmeticExample ae;
	@Before
	 public void before() {
		ae=new ArithmeticExample();
	 }
	
	@Test(expected = ArithmeticException.class)
	public void test() {
		ae.div(10, 0);
	}
}
