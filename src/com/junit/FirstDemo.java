package com.junit;

import static org.junit.Assert.fail;

import org.junit.Test;

public class FirstDemo {
	
	@Test
	public void test() {
		System.out.println("this test is pass!!!");
	}
	
	@Test
	public void test1() {
		System.out.println("this test is fail!!!");
		fail();
	}
}
