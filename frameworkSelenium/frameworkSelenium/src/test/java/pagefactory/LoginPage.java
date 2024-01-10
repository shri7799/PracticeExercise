package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
	
	@FindBy(id="Email")
	static WebElement txtbox_username;
	
	@FindBy(id="Password")
	static WebElement txtbox_password;
	
	@FindBy(xpath="//input[@value='Log in']")
	static WebElement btn_login;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void enterDetails(String u,String p) {
		txtbox_username.sendKeys(u);
		txtbox_password.sendKeys(p);
		btn_login.click();
	}
}
