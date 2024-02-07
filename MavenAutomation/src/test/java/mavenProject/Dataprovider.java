package mavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Dataprovider {
WebDriver driver=null;

@Test(dataProvider="data")
	public void setup(String username ,String password) throws InterruptedException{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
driver.findElement(By.xpath("//button[text()=' Login ']")).click();
Thread.sleep(5000);
String Expected="dmin";
String Actual=driver.findElement(By.xpath("//span[text()='Admin']")).getText();

SoftAssert ass = new SoftAssert();
ass.assertEquals(Expected,Actual);
System.out.println(driver.getTitle());
ass.assertAll();


//Assert.assertEquals(Expected,Actual);

//if(Expected.contains(Actual)) {
//	System.out.println("successful");}
//	else {
//		System.out.println("unsuccessful");
	}
//}
	

@AfterClass
public void teardown() {
	driver.quit();
}
 @Test 
 @DataProvider(name="data")
public Object[][] data(){
	return new Object[][] {
		
			{"Admin","admin123"},
			{"XYZ","abc"},
			{"pqr","stu"}
		
	};
}
}

