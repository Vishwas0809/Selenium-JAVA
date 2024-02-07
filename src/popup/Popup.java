package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://nxtgenaiacademy.com/alertandpopup");
	driver.manage().window().maximize();
	//alert popup
	//https://nxtgenaiacademy.com/alertandpopup/
	driver.findElement(By.name("alertbox")).click();
	driver.switchTo().alert().accept();
	//confirmation popup
	driver.findElement(By.name("confirmalertbox")).click();
	driver.switchTo().alert().dismiss();
	driver.findElement(By.name("promptalertbox1234")).click();
	driver.switchTo().alert().sendKeys("yes");
	driver.switchTo().alert().accept();
	
}
}
