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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HybirdDriven {
	@DataProvider(name="tanvi")
	public Object[][] readExcel() throws InvalidFormatException, IOException {
		Object[][] data=null;
		//step 1:to take file path
		String file_path= "D:\\Selenium\\excel\\data_file.xlsx";
		//step 2:to make file
		File file=new File(file_path);
		//step 3:to open a workbook
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		//step 4: to open a particular sheet
		Sheet sheet=workbook.getSheet("Sheet3");
		//step 5:to evaluate total row
		int n_row=sheet.getPhysicalNumberOfRows();
		System.out.println("no of row is :"+n_row);
		data=new Object[n_row][];
		for (int i = 0; i < data.length; i++) {
			//step 6: to select a particular row
			Row row=sheet.getRow(i);
			//step 7: to get no of col
			int ncol=row.getPhysicalNumberOfCells();
			System.out.println("no of col is "+ncol);
			data[i]=new Object[ncol];
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
	WebDriver driver;
	@Test(dataProvider = "tanvi")
	
	public void test(String keyword,String data) throws InterruptedException, InvalidFormatException, IOException {
		
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		
		if (keyword.equalsIgnoreCase("open browser")) {
			 driver=new EdgeDriver();
			driver.manage().window().maximize();
		}else if(keyword.equalsIgnoreCase("enter url")) {
			driver.get(data);
			Thread.sleep(2000);
		} else if (keyword.equalsIgnoreCase("enter username")) {
			driver.findElement(By.name("user-name")).sendKeys(data);
			Thread.sleep(2000);
		} else if (keyword.equalsIgnoreCase("enter password")) {
			driver.findElement(By.name("password")).sendKeys(data);
			Thread.sleep(2000);
		} else if (keyword.equalsIgnoreCase("click login")) {
			driver.findElement(By.name("login-button")).click();
			Thread.sleep(2000);
		}else if(keyword.equalsIgnoreCase("close browser")) {
			driver.close();
		}
		
	}
}
