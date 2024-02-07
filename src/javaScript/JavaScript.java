package javaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
//		driver.findElement(By.xpath("//a[text()='jdk-8u391-linux-aarch64.rpm']")).click();
////	 WebElement link = driver.findElement(By.xpath("//a[text()='Download jdk-8u391-linux-aarch64.rpm']"));
////	WebElement link = driver.findElement(By.xpath("//a[text()='Download jdk-8u391-linux-aarch64.rpm']"));
//driver.findElement(By.xpath("//a[@class=\"download-file icn-lock\"]"));
//		WebElement link = driver.findElement(By.xpath("//a[@class=\"download-file icn-lock\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
//    
// js.executeScript("arguments[0].click()",link);
		
// //-------------------------------------------------------------------------------------------
//		//-----------to give input on disabled field----//
		//driver.manage().window().maximize();
//		driver.get("https://demoapp.skillrary.com/");
//		
//		
//		
//		WebElement disabled = driver.findElement(By.xpath("//input[@class=\"form-control\"]"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].value='rajeshyadav14112@gmail.com'",disabled);
// ----------------------------------------------------------------------------------------------------------
         //-----Scroll-------------//
		
//		
//		driver.get("https://www.kwokyinmak.com/");
//		Thread.sleep(4000);
//         JavascriptExecutor js=(JavascriptExecutor)driver;
//         js.executeAsyncScript("window.scrollBy(2000,0)");
 
 
 driver.get("https://www.selenium.dev/");
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
// js.executeScript("window.scrollBy(0,500)");
// js.executeAsyncScript("Window,scrollBy(0,document.body.scrollHeight)",args);
     WebElement x = driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));
//     js.executeScript("arguments[0].scrollIntoView(true)",x);
		
		
     
     

     
     
     
     
	}

}
