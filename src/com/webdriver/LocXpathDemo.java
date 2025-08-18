package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocXpathDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoblaze.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("demo123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("pass");
}
}
