package stepdefintions;

import java.io.IOException;

import org.testng.Assert;

import Driver.DriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import utils.ConfigurationReader;



public class loginSteps{
	
	
	   private DriverUtil driver = new DriverUtil();
	   private loginPage loginpage = new loginPage();
	
	@Given("I navigated to corresponding url")
	public void i_navigate_to_url() {
		System.out.print("Login successful");
	}
	
	@When("I enter value in the username field")
	public void i_enter_value_in_the_username_field() throws IOException, InterruptedException {
		loginpage.enterUsername("prashanthi.nandagiri@gmail.com");

	}
	
    @Given("I Launch the order portal website")
    public void i_launch_the_order_portal_website() {
        driver.open(ConfigurationReader.get("url"));
    }


    @Given("I login to the application with valid credentials")
    public void i_login_to_the_application_with_valid_credentials() {
    	loginpage.LoginToApplication("test12345321@gmail.com", "testaccount");
    }
    
    @Then("user logged in successfully")
    public void successful_login() {
    	Assert.assertTrue(loginpage.LogoutVisible());
    }

}
