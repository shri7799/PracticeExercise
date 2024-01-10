package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver=null;
	
	public static void getbrowser() {
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/fiction");
		driver.manage().window().maximize();
		
	}
}
