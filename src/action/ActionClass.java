package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.myntra.com/");
//		Actions act=new Actions(driver);
//          WebElement text = driver.findElement(By.linkText("HOME & LIVING"));
//          act.moveToElement(text).perform();
//          Thread.sleep(4000);
//          WebElement bath = driver.findElement(By.linkText("Bath"));
//          act.click(bath).perform();
//            act.moveByOffset(297,45).click().perform();
          driver.get("https://www.guru99.com/selenium-tutorial.html");
          Actions act=new Actions(driver);
         Thread.sleep(4000);
          act.moveByOffset(389,488).contextClick().perform();
	}

}
