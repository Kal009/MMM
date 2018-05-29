package com.mymeds.testpages;

import com.mymeds.base.BrowserFactory;
import com.mymeds.pages.HomePage;
import com.mymeds.pages.LoginPage;
import com.mymeds.pages.RegisterPage;
import com.mymeds.utility.Screenshots;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class RegisterPageTest extends BrowserFactory {

    HomePage hp = new HomePage();
    LoginPage lp = new LoginPage();
    RegisterPage rp = new RegisterPage();

    String newmail = BrowserFactory.newemail();
    String scr = "scr1";


    @Given("^I am on Loginpage$")
    public void iAmOnLoginpage() throws Throwable {
        hp.Loginpage();
    }

    @When("^I click on registerlink$")
    public void iClickOnRegisterlink() throws Throwable {
        lp.registerlink();
    }

    @Then("^I should navigate to Registerpage$")
    public void iShouldNavigateToRegisterpage() throws Throwable {
        String msg = lp.userregisterpage();
        Assert.assertEquals(msg,"create your account here");
    }


    @When("^I select tital$")
    public void iSelectTital() throws Throwable {
        rp.userTital();

    }

    @And("^I enter firstname as \"([^\"]*)\"$")
    public void iEnterFirstnameAs(String Fname) throws Throwable {
        rp.firstname(Fname);
    }

    @And("^I enter lastname as \"([^\"]*)\"$")
    public void iEnterLastnameAs(String lname) throws Throwable {
       rp.lastname(lname);
    }

    @And("^I enter email as \"([^\"]*)\"$")
    public void iEnterEmailAs(String email) throws Throwable {
       rp.emailaddress(newmail);
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) throws Throwable {
        rp.pass(password);
    }

    @And("^I enter confirm password as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String vpass) throws Throwable {
        rp.vpass(vpass);
    }

    @And("^I accept terms and codition$")
    public void iAcceptTermsAndCodition() throws Throwable {
        rp.checkboxtick();
    }

    @And("^I click on submit botton$")
    public void iClickOnSubmitBotton() throws Throwable {
       rp.submit();
    }

    @Then("^I should successfully creat account$")
    public void iShouldSuccessfullyCreatAccount() throws Throwable {
       String confrimation = rp.confirmation();
       Assert.assertEquals(confrimation,"my account summary");
        Screenshots.takeScreenshot(scr);
    }
}
