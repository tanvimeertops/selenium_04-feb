package com.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgWebdriver {
	WebDriver driver;
	
	@BeforeClass
	public void before() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void enterUsername() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void clickLogin() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 0)
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void after() throws InterruptedException {
		driver.close();
	}
}
