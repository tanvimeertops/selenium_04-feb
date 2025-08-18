package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicXpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/selenium-xpath.html");
	//Xpath=//input[@name='uid']
	
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("133");
	Thread.sleep(2000);
	//Xpath=//tagname[text()='UserID']
	String msg= driver.findElement(By.xpath("//b[text()='Testing']")).getText();
	System.out.println(msg);
}
}
