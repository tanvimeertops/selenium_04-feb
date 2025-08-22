package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ElePartialLink {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"D:\\Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
//	driver.get("file:///D:\\eclipse projects\\Selenium-04-feb\\src\\com\\webdriver\\index.html");
	driver.get("https://www.geeksforgeeks.org/");
	Thread.sleep(2000);
//	driver.findElement(By.partialLinkText("gle")).click();
	driver.findElement(By.partialLinkText("Java")).click();
}
}
