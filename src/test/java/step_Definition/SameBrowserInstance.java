package step_Definition;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SameBrowserInstance {	
	
	public SameBrowserInstance() {
		// Empty Constructor
	}

	@Given("^User opens the \"([^\"]*)\"$")
	public void user_opens_the(String arg1) throws Throwable {
		Hooks.getDriver().navigate().to(arg1);		
	}
	
	 @When("^I enter invalid data on the page$") 
	   public void enterData(DataTable table) throws MalformedURLException, InterruptedException{ 
	 //Initialize data table 
    List<List<String>> data = table.raw();
    System.out.println("-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*" + data.size()); 
    
    //Enter data
    Hooks.getDriver().findElement(By.name("firstname")).sendKeys(data.get(1).get(1));
    Hooks.getDriver().findElement(By.name("lastname")).sendKeys(data.get(2).get(1));
    Hooks.getDriver().findElement(By.name("reg_email__")).sendKeys(data.get(3).get(1));     
    Hooks.getDriver().findElement(By.name("reg_email_confirmation__")).
       sendKeys(data.get(4).get(1)); 
    Hooks.getDriver().findElement(By.name("reg_passwd__")).sendKeys(data.get(5).get(1)); 
    
    Select dropdownB = new Select(Hooks.getDriver().findElement(By.name("birthday_day"))); 
    dropdownB.selectByValue("15"); 
		
    Select dropdownM = new Select(Hooks.getDriver().findElement(By.name("birthday_month")));
    dropdownM.selectByValue("6"); 
		
    Select dropdownY = new Select(Hooks.getDriver().findElement(By.name("birthday_year")));
    dropdownY.selectByValue("1990"); 
		
    Hooks.getDriver().findElement(By.className("_58mt")).click(); 
    // Click submit button Hooks.getDriver().findElement(By.name("websubmit")).click(); 
	
	 }
	
/*	public void examples(Examples examples) {

        int count = examples.getRows().size();
        System.out.println("Count is " + count);
}*/

	
	
}
