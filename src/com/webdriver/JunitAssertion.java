package com.webdriver;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;





public class JunitAssertion {

	@Ignore
	@Test
	public void test1() {
		int a=1,b=7;
		Assert.assertFalse(a>b);
		Assert.assertTrue(a<b);
	}
	
	@Ignore
	@Test
	public void test2() {
		String name1="Saloni",name2="saloni";
//		Assert.assertSame(name1, name2);
		Assert.assertNotSame(name1, name2);
	}
	@Ignore
	@Test
	public void test3() {
		int i=34,j=34;
		Assert.assertEquals(i, j);
		String msg="Dropped!!!";
		Assert.assertEquals("Dropped!!!", msg);
	}
	@Ignore
	@Test
	public void test4() {
		int[] a={1,2,3,4};
		int[] b={1,2,3,8};
		
		Assert.assertArrayEquals(a, b);
	}
	
	@Test
	public void fail1() {
		fail("self failed!!");
	}
}
