package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaticTable {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("file:///D:\\eclipse projects\\Selenium-04-feb\\src\\com\\webdriver\\index2.html");
	for(int i=2;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			String ele=driver.findElement
	(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print("   |   "+ele);
		}
		System.out.println();
	}
	
	
}
}
