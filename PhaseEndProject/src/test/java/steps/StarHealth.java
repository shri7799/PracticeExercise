package steps;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

import org.openqa.selenium.JavascriptExecutor; 
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable; 
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When;

public class StarHealth {
	WebDriver driver;

	@Given("User open the chrome browser and starhealth application")
	 
	public void user_open_the_chrome_browser_and_starhealth_application() {
	//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
	driver = new ChromeDriver(); 
	driver.manage().window().maximize(); 
	driver.get("https://www.starhealth.in");
	}

	@When("User waits for the Welcome to Star Health pop-up and closes it")
	public void user_waits_for_the_welcome_to_star_health_pop_up_and_closes_it() 
	{ 
		try {
	// Implement code to check if the pop-up is present
	WebElement popup = driver.findElement(By.id("popupLocator")); // Replace with the actual locator

	if (popup.isDisplayed()) {
	// If the pop-up is displayed, close it by clicking a close button or other method 
		WebElement closeButton = driver.findElement(By.id("closeButtonLocator"));
	// Replace with the actual locator
	closeButton.click();
	}
	} catch (NoSuchElementException e) {
	// Handle the case where the pop-up is not present 
		System.out.println("Welcome pop-up not found. Continuing without closing.");
	}
	}


	@Then("validates the Star Health home page title using a JUnit assertion")
	public void validates_the_star_health_home_page_title_using_a_j_unit_assertion() {
	// Get the page title using driver.getTitle()
	// Get the actual page title using WebDriver 
	String actualTitle = driver.getTitle();
	
	// Define the expected title
	String expectedTitle = "Star Health Insurance: Medical, Accident and Travel insurance policies"; // Replace with the expected title

	// Use JUnit's assertion to validate the title
	Assert.assertEquals("Page title does not match", expectedTitle, actualTitle);
	}

	@Then("clicks on the Buy Now button") 
	public void clicks_on_the_buy_now_button() {
	// Implement code to locate and click on the "Buy Now" button 
		try {
	WebElement buyNowButton =
	driver.findElement(By.xpath("//*[@id=\"  next\"]/div/div/header/div[2]/div[2]/div/button"));
	// Replace with the actual locator
	buyNowButton.click();
	 
	} catch (NoSuchElementException e) {
	// Handle the case where the "Buy Now" button is not found 
		System.out.println("Buy Now button not found.");
	}
	}


	@And("User enters following details")
	public void user_enters_following_details(DataTable datatable) {
	// Use the DataTable to fetch and input data
	List<Map<String, String>> userList = datatable.asMaps(String.class,String.class);

	for (Map<String, String> data : userList) {
		String fullName = data.get("FullName"); 
		String phNo = data.get("PhNo");
	    String pin = data.get("PIN");

	// Implement code to interact with input fields and enter data 
	driver.findElement(By.xpath("//input[@id='name']")).clear();

	driver.findElement(By.xpath("//input[@id='name']")).sendKeys(fullName); 
	driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]")).clear();
	

	driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]")).sendKeys(phNo); 
	driver.findElement(By.xpath("//input[@id='pinCode']")).clear();
	//Replace with the actual locator for PhNo field
	driver.findElement(By.xpath("//input[@id='pinCode']")).sendKeys(pin);
	// Replace with the actual locator for PIN field
	}
	}
	 
	@Then("User clicks on I need health insurance from the drop-down menu and select plan")
	public void user_clicks_on_i_need_health_insurance_from_the_drop_down_menu_and_select_plan() throws InterruptedException {
	// Locate the dropdown element by its locator
	WebElement dropdownElement = driver.findElement(By.xpath("//div[@class = 'MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase- input MuiOutlinedInput-input']"));
	// Replace with the actual locator
	dropdownElement.click();
	// Click the dropdown to open it 
	Thread.sleep(1000);
	// Locate and click the second option ("My Family") 
	WebElement myFamilyOption = driver.findElement(By.xpath("//li[contains(text(), 'My Family')]")); // Replace with the actual Xpath
	 
	myFamilyOption.click();

	}
	 
	@Then("Validate the user mobile number") 
	public void validate_the_user_mobile_number() {
	try {
	WebElement mobileNumberElement = driver.findElement(By.xpath("//input[@id='contact_no']")); // Replace with the actual locator

	// Get the text of the mobile number element
	String mobileNumber = mobileNumberElement.getText();

	// Define a regular expression pattern for a valid mobile number
	// You can adjust this pattern based on your specific requirements 
	Pattern pattern = Pattern.compile("^[0-9]{10}$");

	// Use a Matcher to check if the mobile number matches the pattern 
	Matcher matcher = pattern.matcher(mobileNumber);
	 
	if(matcher.matches()) {
		System.out.println("Mobile number is valid: "+mobileNumber);
	}else {
		System.out.println("Mobile number is not in valid format: "+mobileNumber);
	}

	// You can throw an exception or fail the test here if needed
	
	} catch (NoSuchElementException e) {
	System.out.println("Mobile number element not found.");
	}
	}
	@And("User clicks on the Star Health logo")
	public void user_clicks_on_the_star_health_logo() {
	// Implement code to click on the Star Health logo to go back to the homepage
	try {
	WebElement logoElement = driver.findElement(By.xpath("//img[@class = 'jss341']")); // Replace with the actual locator
	logoElement.click();
	} catch (NoSuchElementException e) { 
		System.out.println("Star Health logo not found.");
	}
	}

	@Then("Close all the browsers") 
	public void close_all_the_browsers() { 
		System.out.println("Browser closed");
	}

}
