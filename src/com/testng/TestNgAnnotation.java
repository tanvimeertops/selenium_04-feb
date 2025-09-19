package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotation {

	@BeforeClass
	public void beforeTest() {
		System.out.println("this is my test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	@Test
	public void test() {
		System.out.println("this is first method");
	}
	
	@Test
	public void test1() {
		System.out.println("this is second method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	@AfterClass
	public void afterTest() {
		System.out.println("after test");
	}
}
