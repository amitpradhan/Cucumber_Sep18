package stepDefintions;
/*package stepDefinitions;

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

public class LoginTest1_stepDefinitions {
	
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
	// System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	// driver = new ChromeDriver();
		 driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.freecrm.com/index.html");
	 }
	 
	 @When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_Free_CRM()  {
			 String title = driver.getTitle();
			 System.out.println(title);
			 Assert.assertEquals("#1 Free CRM software in the cloud powers sales and customer service", title);
	 }

	 @Then("^user enters username and password$")
	 public void user_enters_and_password()  {
		 driver.findElement(By.name("username")).sendKeys("amitpradhan.2011@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("Test@1234");
	 }

	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button()  {
		 WebElement loginBtn =
				 driver.findElement(By.xpath("//input[@type='submit']"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", loginBtn);
	 }

	 @Then("^user is on home page$")
	 public void user_is_on_home_page()  {
		 String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	     
	 }
	 
	 
	 @Then("^user close the browser$")
	 public void user_close_the_browser()  {
	     driver.quit();
	 }
	 
	
	 

}
*/