package webDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		String r = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("https://www.orangehrm.com/");
		Thread.sleep(5000);
//		String parentId=driver.getWindowHandle();
//		System.out.println("The window id is:" + parentId);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
//		Thread.sleep(4000);
//		//driver.findElement(By.xpath("(//a[@rel=\"noopener\"])[11]")).click();
//		//driver.findElement(By.xpath("//input[@name=\"action_request\"]")).click();
//		Set<String> allId = driver.getWindowHandles();
//		System.out.println(allId);
//		for(String id:allId){
//			if(!id.equals(parentId)){
//			driver.switchTo().window(id);
//			driver.findElement(By.xpath("//input[@name=\"action_request\"]")).click();
			
		
	}

		}


