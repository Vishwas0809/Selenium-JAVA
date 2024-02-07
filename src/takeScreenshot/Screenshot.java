package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.console.model.ConsoleMessage.Source;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		TakesScreenshot shot = (TakesScreenshot)driver;
		//File sourse = shot.getScreenshotAs(OutputType.FILE);
		  //  File Destination = new File("./Screenshot/xyz.png");
		  //  Files.copy(sourse, Destination);
//-------------------------For perticular web element-----------------//
		   WebElement ss = driver.findElement(By.xpath("//button[text()='Request OTP']"));
				   File source = ss.getScreenshotAs(OutputType.FILE);
				   File Destination = new File("./Screenshot/ac.png");
				   Files.copy(source, Destination);
	}

}
