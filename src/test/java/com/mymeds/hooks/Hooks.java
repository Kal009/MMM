package com.mymeds.hooks;

import com.mymeds.base.BrowserFactory;
import com.mymeds.utility.Screenshots;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITest;
import org.testng.annotations.AfterMethod;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Random;

public class Hooks extends BrowserFactory {

    String screen;
    private BrowserFactory brow_factory;
    ExtentTest logger;
    ExtentReports reports;

    public Hooks(BrowserFactory browserFactory) {
        this.brow_factory = browserFactory;
    }

    @Before
    public void startbrowser() throws MalformedURLException {
        brow_factory.openBrowser();
        brow_factory.timeout();
        brow_factory.maximise();
        brow_factory.waitpage();


    }

    @After
    public void tear(Scenario sce) throws IOException {
        if (sce.isFailed()) {
            String failscreenshot = "screen";
            Screenshots.takeScreenshot(sce.getName());
            sce.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
//            logger.log(LogStatus.FAIL, "testfail", sce.getName());

        }

        brow_factory.closebrowser();
    }
}
