package StepDef;

import Base.BaseTest;
import PageLayer.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep {
	LoginPage lp=new LoginPage();
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		BaseTest.initialization();
	  
	}

	@When("^We entered email and password$")
	public void we_entered_email_and_password() throws Throwable {
	lp.loginAction();
	   
	}

	@And("^click on submit$")
	public void click_on_submit() throws Throwable {
	    lp.signin();
	}

	@Then("^User navigate to welcome page$")
	public void user_navigate_to_welcome_page() throws Throwable {
		lp.verifyHomePage();
	    
	}


	
}
