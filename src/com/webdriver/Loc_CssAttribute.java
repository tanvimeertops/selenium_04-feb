package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
/*
 * css attribute:
 * except id and name everything else is attribute
 * tagname[attribute_name='value']
 */
public class Loc_CssAttribute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[data-testid='royal-email']")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
}
}
