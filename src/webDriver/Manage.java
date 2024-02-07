package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Window win=driver.manage().window();
		//win.fullscreen();
		System.out.println(win.getSize());
		System.out.println(win.getPosition());
		win.setSize(new Dimension(570,700));
		win.setPosition(new Point(-8,-8));
		System.out.println(win.getSize());
		System.out.println(win.getPosition());
		Dimension size=win.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		Point pos=win.getPosition();
		System.out.println(pos.getX());
System.out.println(pos.getY());
		
		//driver.quit();

		
		
		
				

	}

}
