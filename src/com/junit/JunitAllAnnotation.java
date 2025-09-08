package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAllAnnotation {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("This will run before class");
	}
	@Before
	public void before() {
		System.out.println("This will run before every methosd");
	}
	@Test
	public void test() {
		System.out.println("this is no 1 test!!!");
	}
	@Ignore
	@Test
	public void test1() {
		System.out.println("this is no 2 test!!!");
	}
	@After
	public void after() {
		System.out.println("This will run after every methosd");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("This will run after every class");
	}
}
