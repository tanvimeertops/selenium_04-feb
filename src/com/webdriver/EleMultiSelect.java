package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
/*
 * by index
 * by value
 * by visible text
 */
public class EleMultiSelect {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"D:\\Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://output.jsbin.com/osebed/2");
	Thread.sleep(2000);
	
	WebElement ele=driver.findElement(By.id("fruits"));
	Select s1=new Select(ele);
	for (int i = 0; i <=2; i++) {
		s1.selectByIndex(i);
	}
	
//	Thread.sleep(2000);
//	s1.selectByValue("grape");
//	Thread.sleep(2000);
//	s1.selectByVisibleText("Orange");
	
}
}
