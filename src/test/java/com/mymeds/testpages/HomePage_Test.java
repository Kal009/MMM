package com.mymeds.testpages;

import com.mymeds.base.BrowserFactory;
import com.mymeds.pages.HomePage;
import com.mymeds.utility.ExtentedReort;
import com.mymeds.utility.Screenshots;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import java.io.IOException;

public class HomePage_Test extends BrowserFactory {
    ExtentReports reports;
    ExtentTest logger;

    HomePage hp = new HomePage();

    @Given("^i me on home page$")
    public void iMeOnHomePage() throws Throwable {
        reports = new ExtentReports("C:\\Users\\Trupesh\\Desktop\\report\\myreport.html");
        logger = reports.startTest("senorio1_Started");
        System.out.println("start");
        logger.log(LogStatus.INFO, "givenmethodexecuted");
    }

    @When("^i click on home page$")
    public void iClickOnHomePage() throws Throwable {
        hp.homePageLink();

        System.out.println("when");
        logger.log(LogStatus.INFO, "userisinhomepage");
    }

    @Then("^i should navigate to home page$")
    public void iShouldNavigateToHomePage() throws Throwable {
        String tital = hp.homepagelogo();
        Assert.assertEquals(tital, "Beauty | Health | Pharmacy and Prescriptions - Boots");
        System.out.println("then");
        logger.log(LogStatus.PASS, "verified Title");
        reports.endTest(logger);
        reports.flush();

    }


}





