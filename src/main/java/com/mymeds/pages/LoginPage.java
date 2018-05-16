package com.mymeds.pages;

import com.mymeds.base.BrowserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BrowserFactory {

    @FindBy(xpath = ".//*[@id='WC_AccountDisplay_links_3']")
    WebElement registerlink;

    @FindBy(xpath = ".//*[@id='WC_UserRegistrationAddForm_div_2']")
    WebElement userregisterlink;


    public String userregisterpage(){
       return userregisterlink.getText();
    }




    public void registerlink(){
        registerlink.click();
    }
}
