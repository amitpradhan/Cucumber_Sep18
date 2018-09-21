package stepDefintions;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest_datadriven_withoutExample_StepDef {
	
	WebDriver driver;

	@Given("^user is already on Login Page datadriven without Example$")
	public void user_is_already_on_Login_Page_datadriven_without_Example()  {
		driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.freecrm.com/index.html");
	 }
	

	@When("^title of login page is Free CRM datadriven without Example$")
	public void title_of_login_page_is_Free_CRM_datadriven_without_Example() {
		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" datadriven without Example$")
	public void user_enters_and_datadriven_without_Example(String username, String password){
		 driver.findElement(By.name("username")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user clicks on login button datadriven without Example$")
	public void user_clicks_on_login_button_datadriven_without_Example() {
		 WebElement loginBtn =
				 driver.findElement(By.xpath("//input[@type='submit']"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user is on home page datadriven without Example$")
	public void user_is_on_home_page_datadriven_without_Example() {
		 String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		// Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
	}

	@Then("^user close the browser datadriven without Example$")
	public void user_close_the_browser_datadriven_without_Example() {
	    driver.quit();
	}

	
}
