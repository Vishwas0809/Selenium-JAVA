package mavenProject;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelData {
	WebDriver driver;
	@Test
	public void PropertyData() throws IOException, InterruptedException  {
//		FileReader read = new FileReader("./src/test/resources/TestData/testdata.properties");
//		Properties pro = new Properties();
//		pro.load(read);
//		
//		String userid = pro.getProperty("username");
//		
//		System.out.println(userid);
//		driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(4000);
//		driver.findElement(By.name("username")).sendKeys(userid);
//		Thread.sleep(4000);
		File fls=new File("./src/test/resources/TestData/Datadriven.xlsx");
		FileInputStream fil=new FileInputStream(fls);
		XSSFWorkbook Book=new XSSFWorkbook(fil);
		XSSFSheet sh=Book.getSheet("sheet1");
		XSSFRow rw=sh.getRow(1);
		XSSFCell cl=rw.getCell(1);
		System.out.println(cl.getStringCellValue());
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys(cl.getStringCellValue());
		Thread.sleep(4000);
		
		
		
		
	}

}
