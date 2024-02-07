package sTepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {
	WebDriver driver;

	@Given("user on loginpage")
	public void user_on_loginpage() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(4000);
	    // Write code here that turns the phrase above into concrete actions
	}

	@And("user click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() {
		driver.close();

		// TODO Auto-generated method stub

	}}


