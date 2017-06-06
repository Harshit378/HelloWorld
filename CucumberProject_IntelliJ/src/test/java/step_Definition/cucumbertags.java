package step_Definition;

import org.openqa.selenium.WebDriver;

import Utils.ObjectMap;
import cucumber.api.java.en.Given;

public class cucumbertags {
	// WebDriver driver = new FirefoxDriver();
	public WebDriver driver;
	ObjectMap objMap = new ObjectMap("D:\\HarshitWorkspace\\CM\\src\\test\\java\\ObjectMap.Properties");

	public cucumbertags() {
		driver = Hooks.driver;
	}

	@Given("^Only one tag$")
	public void only_one_tag() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Given("^Test for only one tag$")
	public void test_for_only_one_tag() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Given("^Only two tag$")
	public void only_two_tag() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Given("^Test for only two tag$")
	public void test_for_only_two_tag() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}
}
