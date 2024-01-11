package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import io.cucumber.java.en.When;

public class AmazonPage {
	WebDriver driver;
	@Given("I open the browser and enter URL")
	public void i_open_the_browser_and_enter_url() { 
		driver = new ChromeDriver();
	driver.manage().window().maximize(); driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}
	
	@When("I enter Email and Password")
	public void i_enter_email_and_password() throws InterruptedException {

	driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("admin@gmail.com");

	driver.findElement(By.xpath("//*[@id=\'ap_password\']")).sendKeys("123456"); Thread.sleep(1500);
	}

	@Then("I click on Sign in button")
	 
	public void i_click_on_sign_in_button() throws InterruptedException { driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}


	@Then("I should see an Error message")
	public void i_should_see_an_error_message() {
	String text=driver.findElement(By.xpath("//span[@class='a-list- item']")).getText();
	System.out.println("Error message form the page" + text);
	}

	@Then("I close the browser")
	public void i_close_the_browser() { driver.quit();
	}

	@Then("I click on Create a amazon account")
	public void i_click_on_create_a_amazon_account() { driver.findElement(By.xpath("//a[@Id ='createAccountSubmit']")).click();
	}

}
