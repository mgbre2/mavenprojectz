package com.cybertek.utilities;

import com.cybertek.pages.HomePage;
import com.cybertek.pages.ListingPage;
import com.cybertek.pages.PrestashopHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
/*

Wrong username
1. go to website http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx (Links to an external site.)Links to an external site.
2. try to login with wrong username
3. verify error message Invalid Login or Password.
Wrong password
1. go to website  http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
2. try to login with wrong password
3. verify error message Invalid Login or Password.
No username
1. go to website http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
2. try to login no username
3. verify error message Invalid Login or Password.
No password
1. go to website http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
2. try to login with no password

3. verify error message Invalid Login or Password.

 */

public class ErrorMessageValidationTest extends TestBase {
   // HomePage homePage = new HomePage();

    @Test
    public void wrongEmailTest() {
        HomePage homePage = new HomePage();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        homePage.username.sendKeys("admin");
        homePage.password.sendKeys("test");
        homePage.loginButton.click();

        String error = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();

        Assert.assertEquals(actualError, error);
    }


        //we use the above to save
        //driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("admin");
       // driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //driver.findElement(By.id("ctl00_MainContent_login_button")).click();

       // String error ="Invalid Login or Password";

       // String  actualError = driver.findElement(By.id("ctl00_MainContent_status")).getText();

        //Assert.assertEquals(error,actualError);




    @Test

    public void wrongPassswordTest(){
        HomePage homePage = new HomePage();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        homePage.username.sendKeys("Tester");
        homePage.password.sendKeys("wrong password");
        homePage.loginButton.click();

        String expextedError = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();
        Assert.assertEquals(actualError, expextedError);


        //driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("Tester");
       // driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("wrong password");
        //driver.findElement(By.id("ctl00_MainContent_login_button")).click();


        //String expectederror ="Invalid Login or Password";
        //String  actualError = driver.findElement(By.id("ctl00_MainContent_status")).getText();


        //Assert.assertEquals(actualError,expectederror);
    }
    @Test
    public void blankUsername(){
        HomePage homePage = new HomePage();

        homePage.open();
        homePage.login("", "test");

        String expextedError = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();
        Assert.assertEquals(actualError, expextedError);
    }

    // this is just a method which does not do anything
//    @Test
    /*
    public void test() {
        ListingPage nilesLane = new ListingPage();

        ListingPage palmetLane = new ListingPage();

        PrestashopHomePage prestashopHomePage = new PrestashopHomePage();

        WebElement tshirt = prestashopHomePage.product("tshirt");

        WebElement dress = prestashopHomePage.product("dress");
    }
    */
}