package popup;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
//		driver.manage().window().maximize();
	
		//--> permission popup
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://www.justdial.com/");
		
		Thread.sleep(2000);
		
		 Robot robo = new Robot();
		
		 robo.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(4000);
		 robo.keyPress(KeyEvent.VK_ENTER);
		
	}

}
