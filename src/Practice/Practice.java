package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//Thread.sleep(4000);
		//driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("firstname")).sendKeys("Vishwas");
		driver.findElement(By.name("lastname")).sendKeys("Mamgain");
	//	Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("88888888");
		driver.findElement(By.cssSelector("input[id=\"password_step_input\"]")).sendKeys("123456");
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[@value='17']")).click();
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("(//option[@value='3'])[2]")).click();
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[text()=\"1998\"]")).click();
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		
		
		
//		driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
//		driver.findElement(By.xpath("(//a[@href=\"#\"])[2]")).click();
//		driver.findElement(By.name("email")).sendKeys("Vishwas");

	}

}
