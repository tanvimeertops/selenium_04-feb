package com.FW;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DataDrivenDemo {
public String[][] readExcel() throws InvalidFormatException, IOException {
	String[][] data=null;
	//step 1:to take file path
	String file_path= "D:\\Selenium\\excel\\data_file.xlsx";
	//step 2:to make file
	File file=new File(file_path);
	//step 3:to open a workbook
	XSSFWorkbook workbook= new XSSFWorkbook(file);
	//step 4: to open a particular sheet
	Sheet sheet=workbook.getSheet("Sheet1");
	//step 5:to evaluate total row
	int n_row=sheet.getPhysicalNumberOfRows();
	System.out.println("no of row is :"+n_row);
	data=new String[n_row][];
	for (int i = 0; i < data.length; i++) {
		//step 6: to select a particular row
		Row row=sheet.getRow(i);
		//step 7: to get no of col
		int ncol=row.getPhysicalNumberOfCells();
		System.out.println("no of col is "+ncol);
		data[i]=new String[ncol];
		for (int j = 0; j < data[i].length; j++) {
			//step 8: to select particular cell
			Cell cell=row.getCell(j);
			//step 9: to convert into value into string
			cell.setCellType(CellType.STRING);
			//step 10: to get data from cell
			data[i][j]=cell.getStringCellValue();
		}
	}
	return data;
}
@Test
public void test() throws InterruptedException, InvalidFormatException, IOException {
	String[][] data =readExcel();
	System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
	
	for (int i = 0; i < data.length; i++) {
		WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("user-name"))
	.sendKeys(data[i][0]);
	Thread.sleep(2000);
	driver.findElement(By.name("password"))
	.sendKeys(data[i][1]);
	Thread.sleep(2000);
	driver.findElement(By.name("login-button")).click();
	}
}
}
