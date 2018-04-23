package com.mymeds.testpages;

import com.mymeds.base.BrowserFactory;
import com.mymeds.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage_Test extends BrowserFactory {

    HomePage hp = new HomePage();

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
        hp.homePageLink();
    }

    @When("^I click on reportum link$")
    public void i_click_on_reportum_link() throws Throwable {

    }

    @Then("^I should navigate to reportum page$")
    public void i_should_navigate_to_reportum_page() throws Throwable {

    }
}
