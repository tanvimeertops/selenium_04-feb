package com.webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotDemo {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	File file=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(file, new File("D:\\Selenium\\SS\\defec1.jpg"));
	driver.close();
}
}
