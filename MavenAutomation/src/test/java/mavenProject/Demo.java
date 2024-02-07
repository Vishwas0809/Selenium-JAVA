//package mavenProject;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class Demo {
//	WebDriver driver;
//     @BeforeClass
//	public void browser_launch() throws InterruptedException{
//	 WebDriver driver=new ChromeDriver();
//	 driver.manage().window().maximize();
//	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(4000);
//	}
//     @Test
//     public void credentials()  {
//    	 
//    	driver.findElement(By.name("username")).sendKeys("Admin");
//    	driver.findElement(By.name("password")).sendKeys("admin123");
//    	
//     }
//     @Test
//     public void loginButton() {
//    	 driver.findElement(By.linkText(" Login ")).click();
//    	 
//     }
//     @Test()
//     public void logout() {
//    	 driver.findElement(By.linkText("An Tran")).click();
//    	 driver.findElement(By.linkText("Logout")).click();
//    	 
//    	 
//     }
//     @AfterClass
//     public void teardown() {
//    	 driver.quit();
//     }
//     
//}
package mavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	
	     WebDriver driver;
	  @BeforeClass (groups="Smoke")
	  @Parameters("browser")
	   public void browser_launch(String browser) throws InterruptedException {
		  if(browser.equalsIgnoreCase("chrome")) {
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(4000);}
		  else if(browser.equalsIgnoreCase("edge")) {
			  driver=new EdgeDriver();
			   driver.manage().window().maximize();
			   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			  Thread.sleep(4000);}
		  }
		      
	   
	   
	  @Test(groups="Smoke")
	   public void credentials() {
		   
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
	   }
	   
	  @Test(groups="Function")
	   public void loginButton() throws InterruptedException {
		   
		  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		 
	   }
	   
	    @Test(groups="Function")
	   public void logout() throws InterruptedException {
	    	 Thread.sleep(4000);
		   driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.linkText("Logout")).click();
	   }
	   
	    @AfterClass(groups="Integration")
	   public void teardown() {
		  	driver.quit();
}}
