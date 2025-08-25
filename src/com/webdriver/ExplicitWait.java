package com.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"D:\\Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	Thread.sleep(2000);
	////*[@id="post-body-7708391096228750161"]/button
	////button[@onclick='timedText()']
	driver.findElement
	(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button")).click();
	Thread.sleep(2000);
	//Xpath=//tagname[text()='UserID']
String msg=	wait.until(ExpectedConditions.visibilityOfElementLocated
		(By.xpath("//p[text()='WebDriver']"))).getText();
System.out.println(msg);
}
}
