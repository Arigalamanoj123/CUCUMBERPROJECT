package com.stepDefinition;

import com.pages.Automation_Loginpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automation_Login
{
	Automation_Loginpage w= new Automation_Loginpage();
	@Given("^the user launch chrome application$")
	public void the_user_launch_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    w.browser();
	}

	
	@When("^the user open Automation Home page$")
	public void the_user_open_Automation_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   w.Homepage1();
	}

	@Then("^the user Login using username and password$")
	public void the_user_Login_using_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    w.details1();
	}

	@Then("^click on the Login button user nagivate to the next page$")
	public void click_on_the_Login_button_user_nagivate_to_the_next_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    w.submit();
	}
}
