package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"D:\\Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	Thread.sleep(2000);
	
	WebElement ele=driver.findElement(By.name("country"));
	Select s1=new Select(ele);
	s1.selectByIndex(5);
	Thread.sleep(2000);
	s1.selectByValue("INDIA");
	Thread.sleep(2000);
	s1.selectByVisibleText("LAOS");
}
}
