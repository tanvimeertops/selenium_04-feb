package com.testng;

import org.testng.annotations.Test;

public class TestNgPriority {

	@Test(priority = 2) 
	public void test() {
		System.out.println("this is test method");
	}
	@Test(priority = 0) 
	public void best() {
		System.out.println("this is best method");
	}
	@Test(priority = 1) 
	public void nest() {
		System.out.println("this is nest method");
	}
	@Test(priority = 3) 
	public void rest() {
		System.out.println("this is rest method");
	}
}
