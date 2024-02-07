package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().fullscreen();
	Thread.sleep(4000);
	//syntax--tagname[attributename='attribute'];
	driver.findElement(By.cssSelector("p[class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();

	
}
}
