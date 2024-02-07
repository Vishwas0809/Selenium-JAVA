package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Window_Handles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.codewithharry.com/");
		Thread.sleep(4000);

		//driver.navigate().refresh();
		Thread.sleep(4000);
		driver.findElement(By.linkText("HTML")).click();
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.findElement(By.linkText("CSS")).click();
}}
