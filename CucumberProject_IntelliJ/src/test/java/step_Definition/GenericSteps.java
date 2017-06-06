package step_Definition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utils.ObjectMap;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenericSteps {
    // WebDriver driver = new FirefoxDriver();
    public WebDriver driver;
    ObjectMap objMap = new ObjectMap("D:\\Backup\\src\\test\\java\\ObjectMap.Properties");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    public GenericSteps() {
        driver = Hooks.driver;
        
    }      
    
    @Given("^User enters \"(.*?)\" in \"(.*?)\" field$")
    public void user_enters_in_field(String arg1, String arg2) throws Throwable {
        
        WebElement element = driver.findElement(ObjectMap.getLocator(arg2));
        
        highLightElement(driver, element);
        
        driver.findElement(ObjectMap.getLocator(arg2)).sendKeys(arg1);
        
    }
    
  
    
    @Then("^Verify \"(.*?)\" is displayed as \"(.*?)\"$")
    public void verify_is_displayed_as(String arg1, String arg2) throws Throwable {
        
        String Diaplayname = driver.findElement(ObjectMap.getLocator(arg1)).getText();
        System.out.println("\n Diaplayname:- " + Diaplayname);
        
        try {
            Assert.assertEquals(arg2, Diaplayname);
            WebElement element = driver.findElement(ObjectMap.getLocator(arg2));
            
            highLightElement(driver, element);
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
        
        finally {
            
            WebElement element = driver.findElement(ObjectMap.getLocator(arg1));
            
            highLightElement(driver, element);
        }
        
    }
    
    @Then("^Get all the links in the page$")
    public void Get_all_the_links_in_the_page(String arg1, String arg2) throws Throwable {
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        
        System.out.println(links.size());
        
        for (int i = 1; i <= links.size(); i = i + 1)
        
        {
            
            System.out.println(links.get(i).getText());
            
        }
        
    }
    
    /*
     * @Then("^Scroll to \"(.*?)\"$") public void Scroll_to(String arg1) throws
     * Throwable { WebElement element =
     * driver.findElement(ObjectMap.getLocator(arg1)); Actions actions = new
     * Actions(driver); actions.moveToElement(element); // actions.click();
     * actions.perform(); }
     */
    
    @Given("^there are \"(.*?)\" cup coffee left in the machine$")
    public void there_are_cup_coffee_left_in_the_machine(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
    
    @Given("^I have deposited \"(.*?)\" Dollors$")
    public void i_have_deposited_Dollors(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
    
    @When("^I press the \"(.*?)\" button$")
    public void i_press_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
    
    @Then("^I should be \"(.*?)\" a coffee$")
    public void i_should_be_a_coffee(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
    
    // Element Highliter code
    public static void highLightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                element);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
            System.out.println(e.getMessage());
        }
        
        js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
        
    }
    
    @Given("^User select \"(.*?)\" from the \"(.*?)\" dropdown list$")
    public void user_select_from_the_dropdown_list(String arg1, String arg2) throws Throwable {
        
        WebElement element = driver.findElement(ObjectMap.getLocator(arg2));
        highLightElement(driver, element);
        
        WebElement element1 = (driver.findElement(ObjectMap.getLocator(arg2)));
        Select se = new Select(element1);
        se.selectByVisibleText(arg1);
        
        /*
         * Select selectByValue = new
         * Select(driver.findElement(ObjectMap.getLocator(arg2)));
         * selectByValue.selectByValue(arg1); Thread.sleep(2000);
         */
    }
    
    @Given("^User click \"([^\"]*)\" key$")
    public void user_click_key(String arg1) throws Throwable {
        driver.findElement(ObjectMap.getLocator(arg1)).sendKeys(Keys.ENTER);
        
    }
    
    @Given("^Open windows Word application$")
    public void open_windows_Word_application() throws Throwable {
        
        System.out.println("Hello");
    }
}
