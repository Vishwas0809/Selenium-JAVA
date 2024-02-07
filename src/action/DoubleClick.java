package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		WebElement button = driver.findElement(By.linkText("Sign In"));
		Actions act=new Actions(driver);
		//act.keyDown(Keys.CONTROL).click(button).perform();
		//act.keyUp(Keys.CONTROL).perform();
		act.click(button).perform();
		
		
	}

}
