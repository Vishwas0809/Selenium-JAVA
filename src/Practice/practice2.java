package Practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
import takeScreenshot.Screenshot;

public class practice2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   driver.get("https://www.flipkart.com/");
   Actions act=new Actions(driver);
   act.keyDown(Keys.CONTROL).perform();
   driver.findElement(By.xpath("(//img[@class=\"_2puWtW _3a3qyb\"])[2]")).click();
     
  // System.out.println(parentid);
   act.keyUp(Keys.CONTROL).perform();
   act.keyDown(Keys.CONTROL).click(driver.findElement(By.linkText("Become a Seller"))).keyUp(Keys.CONTROL).perform();
   Set<String> childid = driver.getWindowHandles();
   ArrayList<String> a=new ArrayList<>(childid);
  
   driver.switchTo().window(a.get(2));
   String parentid = driver.getWindowHandle();
   for(String id:childid) {
	   if(id.equals(parentid)) {
		   driver.close();
	   }
   }
	
	}
   

	   }
		   
   
	



	


