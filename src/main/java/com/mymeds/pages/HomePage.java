package com.mymeds.pages;

import com.mymeds.base.BrowserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.SQLOutput;

public class HomePage extends BrowserFactory {

    @FindBy(xpath = ".//*[@id='menu']/nav/ul/li[1]/a")
    WebElement homelink;







    public void homePageLink(){
      String tital =  driver.getTitle();
        System.out.println(tital);
    }
}
