package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicTable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	Thread.sleep(2000);
	List<WebElement> col= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	System.out.println("no of col :"+col.size());
	List<WebElement> row= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	System.out.println("no of row is :"+row.size());
	
	for (int i = 1; i <=row.size(); i++) {
		for (int j = 1; j <=col.size(); j++) {
			String data=driver.findElement
		(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print("  |  "+data);
			Thread.sleep(1000);
		}
		System.out.println();
	}
	
}
}
