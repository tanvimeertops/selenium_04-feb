package com.webdriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ElePopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"D:\\Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.guru99.com/popup.php");
	Thread.sleep(2000);
	String main_w= driver.getWindowHandle();
	System.out.println(main_w);
	driver.findElement(By.partialLinkText("Here")).click();
	Thread.sleep(2000);
	 Set<String> all_w= driver.getWindowHandles();
	System.out.println("\nall window :"+all_w);
	Iterator<String> i1=all_w.iterator();
	while (i1.hasNext()) {
		String child_w = i1.next();
		if(!main_w.equals(child_w)) {
			driver.switchTo().window(child_w);
			Thread.sleep(2000);
			driver.findElement(By.name("emailid")).sendKeys("tops@gmail.com");
			Thread.sleep(2000);
			driver.close();
		}
	}
	driver.switchTo().window(main_w);
	Thread.sleep(2000);
	driver.close();
}
}
