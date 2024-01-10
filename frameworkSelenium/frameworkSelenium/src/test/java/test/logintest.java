package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagefactory.HomePage;
import pagefactory.LoginPage;
import pagefactory.TestBase;

public class logintest extends TestBase{
	
	WebDriver d;
	HomePage  h;
	LoginPage l;
	
  @Test
  public void testLogin() {
 
	  h.clickLoginLink();
	  l.enterDetails("Itest@test.com", "Itest@test");
  }
  
  @BeforeTest()
  public void setup() {
	  getbrowser();
	  h=new HomePage();
	  l=new LoginPage();

  }
}
