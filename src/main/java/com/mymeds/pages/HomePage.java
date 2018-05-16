package com.mymeds.pages;

import com.mymeds.base.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLOutput;

public class HomePage extends BrowserFactory {


    @FindBy(xpath = ".//*[@id='logo']/a/img")
    WebElement homelink;

    @FindBy(xpath = "//a[@id='signInQuickLink']")
    WebElement signinglink;



    public void homePageLink() throws InterruptedException {

      homelink.click();
      Thread.sleep(1000);

    }

    public String  homepagelogo() throws InterruptedException {
        return  driver.getTitle();

    }

    public void signin(){
        signinglink.click();
    }

    public void Loginpage (){
        homelink.click();
        signinglink.click();

    }

}
