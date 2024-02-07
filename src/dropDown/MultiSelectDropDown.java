package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement drop = driver.findElement(By.id("cars"));
		Select sct=new Select(drop);
		System.out.println(sct.isMultiple());
		sct.selectByIndex(3);
		System.out.println(sct.getFirstSelectedOption().getText());
		sct.selectByVisibleText("Volvo");
	}



//			driver.get("https://demoqa.com/select-menu");
//			driver.manage().window().maximize();
//			
//			WebElement multi = driver.findElement (By.id("cars"));
//			
//			Select sct =new Select(multi);
//			
//			System.out.println( sct.isMultiple());
//			
//			sct.selectByIndex(3);
//			System.out.println(	sct.getFirstSelectedOption().getText());
//			
//			Thread.sleep(4000);
//			sct.selectByValue("saab");
//			
//			Thread.sleep(4000);
//			sct.selectByVisibleText("Volvo");
//			
//			
//			sct.deselectAll();
//			
//		
//			
			     
			
			
			
	}

