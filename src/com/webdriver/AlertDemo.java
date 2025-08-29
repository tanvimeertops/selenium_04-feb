package com.webdriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"D:\\Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	
	driver.findElement(By.name("cusid")).sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	Alert a1=driver.switchTo().alert();
	Thread.sleep(2000);
	System.out.println("mag:"+a1.getText());
	Thread.sleep(2000);
//	a1.dismiss();
	a1.accept();
	Thread.sleep(2000);
	Alert a2=driver.switchTo().alert();
	Thread.sleep(2000);
	System.out.println("alert 2: "+a2.getText());
	a1.accept();
	Thread.sleep(2000);
	driver.close();
}
	
}
