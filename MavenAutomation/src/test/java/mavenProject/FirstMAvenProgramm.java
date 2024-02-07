package mavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstMAvenProgramm {
	@Test
	
	public void setup(){
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	

}
}