package step_Definition;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.StepDefinitionReporter;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public List<HashMap<String, String>> datamap;
	StepDefinitionReporter stepdefination;
	public static WebDriver driver;
	Scenario scenario;

	@Before
	public void openBrowser(Scenario scenario) throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Backup\\lib\\chromedriver.exe");
		//driver = new FirefoxDriver();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("disable-infobars");
		driver = new ChromeDriver(co);
		//driver = new FirefoxDriver();
		driver.manage().getCookies();
		driver.manage().window().maximize();
		
		
	}

	// Embed a screenshot in test report

	@After
	public void embedScreenshot(Scenario scenario) {
		

		try {

			String status = (scenario.getStatus());
			scenario.write("Current Page URL is " + driver.getCurrentUrl() + " - " + " " + status.toUpperCase());
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		} catch (WebDriverException somePlatformsDontSupportScreenshots) {
			System.err.println(somePlatformsDontSupportScreenshots.getMessage());
		} finally {
			driver.close();
			driver.quit();
		}
	}
}