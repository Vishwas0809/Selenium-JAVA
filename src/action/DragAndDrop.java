package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		Actions act=new Actions(driver);
//		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().frame(frame);
		WebElement source = driver.findElement(By.xpath("//img[@alt=\"The peaks of High Tatras\"]"));
		WebElement destination = driver.findElement(By.id("trash"));
act.dragAndDrop(source, destination).perform();

	}

}
