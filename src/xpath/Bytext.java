package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bytext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
	driver.manage().window().maximize();
		//Thread.sleep(4000);
	driver.findElement(By.xpath("(//a[text()=\"Women\"])[2]")).click();
	driver.findElement(By.xpath("(//img[contains(@src,'https://assets.myntassets.com/w_980,c_limit')])[2]")).click();
	WebElement link = driver.findElement(By.xpath("(//a[contains(text(),'Home')])[2]"));
	System.out.println(link.getText());
	
//	driver.findElement(By.xpath("//a[text()='Women']")).click();
//	
//	driver.findElement(By.xpath("(//img[contains(@src,'https://assets.myntassets.com/w_980,c_limit')])[2]")).click();
//	
//	
//	WebElement link = driver.findElement(By.xpath("(//a[contains(text(),'Home')])[2]"));
//	
//	     System.out.println(   link.getText());


	}

}
