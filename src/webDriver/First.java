package webDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class First 
{
	public static void main(String[] args) throws InterruptedException
	{		
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String sourcecode=driver.getPageSource();
		//System.out.println(sourcecode);
		//driver.close();
		//driver.quit();
	Navigation nav = driver.navigate();
	nav.back();
	Thread.sleep(5000);
	nav.forward();
	Thread.sleep(5000);
	nav.refresh();
	
	
				
		
	}

}
