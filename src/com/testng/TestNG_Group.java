package com.testng;

import org.testng.annotations.Test;

public class TestNG_Group {
  @Test(groups = {"green"})
  public void green1() {
	  System.out.println("This is green 1");
  }
  @Test(groups = {"green"})
  public void green2() {
	  System.out.println("This is green 2");
  }
  @Test(groups = {"green"})
  public void green3() {
	  System.out.println("This is green 3");
  }
  
  @Test(groups = {"red"})
  public void red1() {
	  System.out.println("This is red 1");
  }
  @Test(groups = {"red"})
  public void red2() {
	  System.out.println("This is red 2");
  }
  
  @Test(groups = {"red"})
  public void red3() {
	  System.out.println("This is red 3");
  }
  @Test(groups = {"red","green"})
  public void red_green() {
	  System.out.println("This is red and green");
  }
}
