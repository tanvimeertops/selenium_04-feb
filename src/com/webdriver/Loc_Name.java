package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Loc_Name {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("tanvi@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("pass")).sendKeys("12345678");
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
	
}
}
