package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
         driver.get("https://www.oracle.com/java/technologies/javase-jdk17-doc-downloads.html");
         driver.findElement(By.linkText("jdk-17.0.9_doc-all.zip")).click();
         driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
         driver.findElement(By.className("icn-close w11close")).click();
	}
}
