package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameter_FB {
  @Test
  @Parameters({"username","password"})
  public void f(String username,String pass) throws InterruptedException {
	  System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email"))
		.sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pass"))
		.sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
  }
}
