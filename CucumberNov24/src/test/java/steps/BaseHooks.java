package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
public class BaseHooks {
	// Global hooks
		// Global hooks will run once before any scenario is run or after all scenario
		// have been run.

		@BeforeAll
		public static void featureStarts() {

			System.out.println("The feature has started execution");
		}

		@AfterAll
		public static void featureEnds() {

			System.out.println("The feature has completed execution");
		}

		public static WebDriver driver;

		@Before(order = 0, value = "@login and @functional")
		public void ConditionalHooks() {

			System.out.println("Task 1: Open the browser");
		}

		@Before(order = 0, value = "@functional")
		public void openBrowser() {

			System.out.println("Task 2: Initialize the browser and open it");
			System.out.println("Opening Browser");
			driver = new ChromeDriver();

		}

		@Before(order = 1, value = "@functional")
		public void managebrowserWindow() {

			System.out.println("Task 3: Delete the cookies and maximize window");

			// driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		}

		@Before(order = 2, value = "@functional")
		public void openUrl() {

			System.out.println("Task 4: Open the URL in browser");

			driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		}

		@BeforeStep
		public void stepStart() {

			System.out.println("The steps has started excution");
		}

		@AfterStep
		public void stepEnd() {

			System.out.println("The steps has completed execution");
		}

		// these method I want to run after every secnario in my feature

		@After(order = 2, value = "@functional")
		public void captureTitle() {

			System.out.println(driver.getTitle());

		}

		@After(order = 1, value = "@functional")
		public void closeBrowser() {

			// driver.close();
			driver.quit();
		}

		@After(order = 0, value = "@functional")
		public void TestCompleteMessage() {

			System.out.println("Test scenario is now completed");
		}
}
