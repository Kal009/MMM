package com.mymeds.testpages;

import com.mymeds.base.BrowserFactory;
import com.mymeds.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePage_Test extends BrowserFactory {

    HomePage hp = new HomePage();

    @Given("^i me on home page$")
    public void iMeOnHomePage() throws Throwable {

        System.out.println("start");
    }

    @When("^i click on home page$")
    public void iClickOnHomePage() throws Throwable {
        hp.homePageLink();

        System.out.println("when");
    }

    @Then("^i should navigate to home page$")
    public void iShouldNavigateToHomePage() throws Throwable {
        String tital = hp.homepagelogo();
        Assert.assertEquals(tital,"Beauty | Health | Pharmacy and Prescriptions - Boots");
        System.out.println("then");
    }



}
