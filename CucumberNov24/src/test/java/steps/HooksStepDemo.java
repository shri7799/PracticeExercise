package steps;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class HooksStepDemo {
	@Given("User is on Main Page")
	public void user_is_on_main_page() {
		
		System.out.println("User is on the main page");
	  
	}

	@Then("User Enters username")
	public void user_enters_username() {
		
		BaseHooks.driver.findElement(By.xpath("//input[@id=\"wpName2\"]")).sendKeys("admin");
	 
	}

	@Then("User enters password")
	public void user_enters_password() {
		
		BaseHooks.driver.findElement(By.xpath("//input[@id=\"wpPassword2\"]")).sendKeys("admin@123");
	  
	}

	@When("User clicks on Login link")
	public void user_clicks_on_login_link() {
		BaseHooks.driver.findElement(By.xpath("//span[text()='Log in']")).click();

	}

	@Then("User clicks on checkbox on login page")
	public void user_clicks_on_checkbox_on_login_page() {
		
		BaseHooks.driver.findElement(By.xpath("//input[@id='wpRemember']")).click();
	
	}

	@Then("user clicks on Forgot your password? link")
	public void user_clicks_on_forgot_your_password_link() {
		
		BaseHooks.driver.findElement(By.linkText("Forgot your password?")).click();
	
	}
}
