package com.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;
@RunWith(Parameterized.class)
public class JunitParameter {
//9.15
	int f_no,s_no,e_no;
	AdditionDemo ad;
	@Before
	public void before() {
		ad=new AdditionDemo();
	}
	
	public JunitParameter(int f_no,int s_no,int e_no) {
		this.f_no=f_no;
		this.s_no=s_no;
		this.e_no=e_no;
	}
	
	@Parameterized.Parameters
	public static Collection input() {
	return Arrays.asList(new Object[][] {{1,2,3},{3,4,7},{5,6,11}});
	}
	
	@Test
	public void test() {
		System.out.println("My expected no is :"+e_no);
		Assert.assertEquals(e_no, ad.sum(f_no, s_no));
	}
	
}
