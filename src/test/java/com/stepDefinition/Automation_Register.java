package com.stepDefinition;

import com.pages.Automation_Register_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automation_Register {
	Automation_Register_page q=new Automation_Register_page();
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    q.launchbrowser();
	}

	@When("^the user open the Automation Home page$")
	public void the_user_open_the_Automation_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	q.Homepage();
	}

	@Then("^the user Register using username and password$")
	public void the_user_Register_using_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   q.details();
	}

	@Then("^click on the Register button user nagivate to the next page$")
	public void click_on_the_Register_button_user_nagivate_to_the_next_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    q.submit();
	}

}
