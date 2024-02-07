package activeElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiveElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.switchTo().activeElement().sendKeys("Admin123");
		Actions act=new Actions(driver);
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();
		driver.switchTo().activeElement().sendKeys("password123");
		
		
	}

}
