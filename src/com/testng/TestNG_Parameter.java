package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameter {
  @Test
  @Parameters({"username","password"})
  public void f(String username,String pass) throws InterruptedException {
	  WebDriver driver;
		
		
			System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).
			sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.id("password")).
			sendKeys(pass);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			driver.close();
  }
}
