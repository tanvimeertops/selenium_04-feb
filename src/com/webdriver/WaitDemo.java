package com.webdriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Wait
 * implicit wait
 * explicit wait
 * 
 */
public class WaitDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"D:\\Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://output.jsbin.com/osebed/2");
	Thread.sleep(2000);
	
	WebElement ele=driver.findElement(By.id("fruits"));
	Select s1=new Select(ele);
	for (int i = 0; i <=2; i++) {
		s1.selectByIndex(i);
	}
}
}
