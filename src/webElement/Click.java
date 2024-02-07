package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(4000);
     //   driver.findElement(By.name("username")).sendKeys("Admin");
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        username.clear();
       username.sendKeys("Admin");
        
        driver.findElement(By.name("username")).sendKeys("Admin");

        driver.findElement(By.name("password")).sendKeys("admin123");
        //driver.findElement(By.tagName("button")).click();        
WebElement forgot=driver.findElement(By.tagName("button"));
System.out.println(forgot.getText());
System.out.println(forgot.getTagName());

forgot.isDisplayed();
forgot.isEnabled();
forgot.isSelected();

System.out.println(forgot.isDisplayed());
System.out.println(forgot.isEnabled());
System.out.println(forgot.isSelected());



        
	}

}
