package synchronisation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://github.com/signup?user_email=&source=form-home-signup");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
driver.findElement(By.id("email")).sendKeys("Vishu@google.com");
      WebElement continuee = driver.findElement(By.xpath("(//button[contains(text(),' Continue')])[1]"));
wait.until(ExpectedConditions.elementToBeClickable(continuee));
   continuee.click();
//   Wait wait1 = new FluentWait(driver).withTimeout(SECOND).pollingEvery(timeout, SECONDS).ignoring(Exception.class);
	}

}
 