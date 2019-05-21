package com.cybertek.tests.Project;
//import credentials.Credential;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    @FindBy(xpath = "//button[@id='SubmitLogin']//span")
    WebElement singinBtn;


    public void login() {

      //  driver.get("http://automationpractice.com/index.php");
        //email.sendKeys(Credential.getUserName());
        //password.sendKeys(Credential.getPassword());
        singinBtn.click();



    }

}

