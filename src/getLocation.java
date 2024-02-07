

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation { 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.linkText("OrangeHRM, Inc"));
		
		Point loc = link.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		WebElement link2=driver.findElement(By.partialLinkText("OrangeHRM"));
		Rectangle rect = link2.getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());

	}
}
