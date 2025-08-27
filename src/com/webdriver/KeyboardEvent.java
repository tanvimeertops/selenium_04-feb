package com.webdriver;

import javax.tools.Diagnostic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	WebElement email=driver.findElement(By.name("email"));
	Actions actions=new Actions(driver);
	Action a1=actions
			.moveToElement(email)
			.click()
			.keyDown(email, Keys.SHIFT)
			.sendKeys("tanvi")
			.doubleClick()
			.contextClick()
			.keyUp(email, Keys.SHIFT)
			.build();
	a1.perform();
	
}
}
