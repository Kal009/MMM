package com.mymeds.base;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    public static WebDriver driver;

    private String browser = (System.getProperty("browser") == null) ? "" : System.getProperty("browser");

    public String url = "http://www.boots.com/";

    public String nodeURL;

    DesiredCapabilities caps;

    //cross browser for browserstak

   /* public static final String USERNAME = "kalpesh72";
    public static final String AUTOMATE_KEY = "qVdpf6bjJwnPjbZgLHbb";
    public static final String urL1 = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

   */

    public BrowserFactory() {
        PageFactory.initElements(driver, this);
    }

    public WebDriver openBrowser() throws MalformedURLException {

        String nodeUR1 = "http://192.168.0.20:4547/wd/hub";
        String nodeUR2 = "http://192.168.0.20:4548/wd/hub";
        String nodeUR3 = "http://192.168.0.20:4549/wd/hub";

//Original code
        switch (browser) {
            case "chrome":
               /* caps = DesiredCapabilities.chrome();
                caps.setPlatform(Platform.WIN10);
                driver = new RemoteWebDriver(new URL(nodeUR1), caps);*/

                ChromeDriverManager.getInstance().setup();
                 driver = new ChromeDriver();
                break;

            case "ie":

                /*caps = DesiredCapabilities.internetExplorer();
                caps.setPlatform(Platform.WIN10);
                driver = new RemoteWebDriver(new URL(nodeUR3), caps);*/

                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;
            default:

               /* caps = DesiredCapabilities.firefox();
                caps.setPlatform(Platform.WIN10);
                driver = new RemoteWebDriver(new URL(nodeUR2), caps);*/

                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();

        }

        driver.get(url);
        return driver;
    }

    public void closebrowser() {
        driver.quit();
    }

    public void maximise() {
        //driver.manage().window().maximize();
    }

    public void timeout() {
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

    }

    public void waitpage() {
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    public static String newemail(){
        Random random = new Random();
        int mail = random.nextInt();

        return  mail+"vp@gmail.com";
    }

    public static WebDriver init() {
        return driver;
    }

}
