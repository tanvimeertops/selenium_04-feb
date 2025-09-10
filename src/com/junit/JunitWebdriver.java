package com.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JunitWebdriver {
	WebDriver driver;
	@Before
	public void before() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
	}
	
	@After
	public void after() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
}
