package com.mymeds.pages;

import com.mymeds.base.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BrowserFactory {

    @FindBy(xpath = ".//*[@id='editRegistrationTitle']")
    WebElement usertital;

    @FindBy(xpath = ".//*[@id='WC_UserRegistrationAddForm_NameEntryForm_FormInput_firstName_1']")
    WebElement firstname;

    @FindBy(xpath = ".//*[@id='WC_UserRegistrationAddForm_NameEntryForm_FormInput_lastName_1']")
    WebElement lastname;

    @FindBy(xpath = ".//*[@id='WC_UserRegistrationAddForm_FormInput_logonId_In_Register_1_1']")
    WebElement emailid;

    @FindBy(xpath = ".//*[@id='WC_UserRegistrationAddForm_FormInput_logonPassword_In_Register_1']")
    WebElement password;

    @FindBy(xpath = ".//*[@id='WC_UserRegistrationAddForm_FormInput_logonPasswordVerify_In_Register_1']")
    WebElement verifypass;

    @FindBy(css = ".termsAndCondDesc")
    WebElement checkbox;

    @FindBy(xpath = ".//*[text()='Create my account']")
    WebElement submitbutton;

    @FindBy(xpath = ".//*[@id='WC_MyAccountSidebarDisplayf_links_0']")
    WebElement mysummary;


    public void userTital() throws InterruptedException {
        new Select(usertital).selectByIndex(3);
        Thread.sleep(1000);
    }

    public void firstname(String name) throws InterruptedException {
        firstname.sendKeys(name);
        Thread.sleep(1000);
    }

    public void lastname(String lname) {
        lastname.sendKeys(lname);
    }

    public void emailaddress(String email) {
        emailid.sendKeys(email);
    }

    public void pass(String password1) {
        password.sendKeys(password1);
    }

    public void vpass(String vpassword){
        verifypass.sendKeys(vpassword);
    }

    public void checkboxtick(){
     // Actions act = new Actions(driver);
    //  act.moveToElement(driver.findElement(By.cssSelector("label[class='chckbox'][for='termsAndConditions']"))).click().build().perform();

       checkbox.click();

    }
    public void submit(){
        submitbutton.click();
    }
    public String confirmation (){
        return mysummary.getText();
    }

}
