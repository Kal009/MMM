package com.mymeds.base;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    public static WebDriver driver;

    private String browser = (System.getProperty("browser") == null) ? "" : System.getProperty("browser");

    public String url = "https://www.mymedsandme.com";

    public BrowserFactory() {
        PageFactory.initElements(driver, this);
    }

    public WebDriver openBrowser() {

        switch (browser) {
            case "chrome":

                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;

            case "ie":

                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;
            default:

                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();

        }

        driver.get(url);
        return driver;
    }

    public void closebrowser(){
        driver.quit();
    }

    public void maximise (){
        driver.manage().window().maximize();
    }

    public void timeout(){
        driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);

    }
    public void waitpage(){
        driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
    }

    public static WebDriver init (){
        return  driver;
    }

}
