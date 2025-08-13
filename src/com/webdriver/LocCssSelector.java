package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
/*
 * Css selector :
 * css id :
 * syntax:
 * tagname#id
 * input#user-name
 * css class
 * css attri
 */
public class LocCssSelector {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#login-button")).click();
}
}
