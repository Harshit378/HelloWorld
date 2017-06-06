package step_Definition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ObjectMap;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CoffeeMachineSteps {
    
    public WebDriver driver;
    ObjectMap objMap = new ObjectMap("D:/0995_Workspace/CM/src/test/java/ObjectMap.Properties");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    public CoffeeMachineSteps() {
        driver = Hooks.driver;
    }
    
    @Given("^User navigates to \"(.*?)\"$")
    public void user_navigates_to(String arg1) throws Throwable {
        driver.get(arg1);
        String Pagetitle = driver.getTitle();        
        System.out.println(Pagetitle);
    }
    
    @When("^User clicks \"(.*?)\" button$")
    public void user_clicks_button(String arg1) throws Throwable {
        
        WebElement element = driver.findElement(ObjectMap.getLocator(arg1));        
        highLightElement(driver, element);        
        driver.findElement(ObjectMap.getLocator(arg1)).click();        
        Thread.sleep(3000);
    }
    
    // Method to highlight the element
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
    
}
