package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		WebElement parent = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(parent);
		driver.switchTo().frame(0);
		driver.findElement(By.id("a")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("xyz");
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//option[text()='Baby Cat']")).click();
		driver.switchTo().defaultContent();
		WebElement home = driver.findElement(By.linkText("Home"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).perform();
		home.click();
		act.release().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		

	}

}
