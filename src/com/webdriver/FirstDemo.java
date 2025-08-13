package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstDemo {
public static void main(String[] args) throws InterruptedException {
	//browser setup
	//bridge between code to browser
	System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
	//to open empty browser
	WebDriver driver=new EdgeDriver();
	//to maximise window
	driver.manage().window().maximize();
	//to open website
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	System.out.println("title is :"+driver.getTitle());
	System.out.println("url is :"+driver.getCurrentUrl());
//	driver.close();//to close a tab
	driver.quit();//to close browser
}
}
