package com.prestashop.pages;

import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
public class LoginPage {

        public LoginPage(){

            PageFactory.initElements(Driver.getDriver(), this);
        }    //Username
    @FindBy(id="email")
    public WebElement username;

    //Password
    @FindBy(id="passwd")
    public WebElement password;

    //Login
    @FindBy(id="SubmitLogin")
    public WebElement loginButton;

    //Sign in
    @FindBy(linkText="Sign in")
    public WebElement signIn;

    //Log out //a[@class='logout']
    @FindBy(xpath = "//a[@class='logout']")
    public WebElement logout;

    //Auto Login
    public void login(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }



    public void signIn(){

        signIn.click();
    }

    //Open browser and Go to Url
    public void openUrl() {
        //Driver.getDriver().get("http://automationpractice.com/index.php"); brfore configuration.properties
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
}

