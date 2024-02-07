package dropDown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement drop = driver.findElement(By.tagName("select"));
//		List<WebElement> droplist = driver.findElements(By.tagName("select"));
//		for(WebElement text:droplist) {
//		
//		System.out.println(text.getText());
		
//		}
		
		Select sct=new Select(drop);
		List<WebElement> op=sct.getOptions();
		for(WebElement d:op) {
			System.out.println(d.getText());
		}
		Thread.sleep(4000);
		sct.selectByIndex(4);
		sct.selectByVisibleText("India");
		sct.selectByValue("BRA");
		System.out.println(sct.isMultiple());
		System.out.println(sct.getFirstSelectedOption().getText());
		
		
		

	}

}
