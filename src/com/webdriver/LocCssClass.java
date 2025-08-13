package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v136.tethering.Tethering;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * css class:
 * syntax:
 * tagname.class_value
 */
public class LocCssClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input.input_error.form_input"))
	.sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input.input_error.form_input"))
	.sendKeys("secret_sauce");
	Thread.sleep(2000);
}
}
