package stepDefintions;
/*package stepDefinitions;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest_Datadriven_withExamplesStepDef {

	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page()  {
		driver = new FirefoxDriver();
		driver.get("http://freecrm.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() { 
			 String title = driver.getTitle();
			 System.out.println(title);
			// Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	}

	//Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password){
	 driver.findElement(By.name("username")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 }

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		WebElement loginBtn =
				 driver.findElement(By.xpath("//input[@type='submit']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", loginBtn);
	}

	
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		 String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("CRMPRO", title);
	}
	
	
	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
	    driver.quit();
	}
	
	//BELOW TWO STEPS ARE FOR Contact page feature
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() throws InterruptedException {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	}

	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_and_and(String firstname, String lastname, String position)  {
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		 driver.findElement(By.id("surname")).sendKeys(lastname);
		 driver.findElement(By.id("company_position")).sendKeys(position);
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	}
	
}
*/