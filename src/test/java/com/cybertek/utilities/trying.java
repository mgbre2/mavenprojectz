package com.cybertek.utilities;
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

import com.cybertek.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class trying extends TestBase {
    HomePage word= new HomePage();
    @Test
    public void wronguser() {


        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx ");
        word.username.sendKeys("test");
        word.password.sendKeys("test");
        word.loginButton.click();
        String error ="Invalid Login or Password.";
        String actual= word.errorMessage.getText();
        Assert.assertTrue(actual.contains(error));
       /*
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String error = "Invalid Login or Password.";
        String actual = driver.findElement(By.id("ctl00_MainContent_status")).getText();
        Assert.assertEquals(actual, error);
        // Assert.assertTrue(actual.contains(error));work
        */
    }

    @Test
    public void worngpass() {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx ");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("formal");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String error = "Invalid Login or Password.";
        String actual = driver.findElement(By.id("ctl00_MainContent_status")).getText();
        Assert.assertEquals(actual, error);
    }

    @Test
    public void nousername() {


        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx ");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String error = "Invalid Login or Password.";
        String actual = driver.findElement(By.id("ctl00_MainContent_status")).getText();
        Assert.assertEquals(actual, error);

    }

    @Test
    public void nopass() {


        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx ");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String error = "Invalid Login or Password.";
        String actual = driver.findElement(By.id("ctl00_MainContent_status")).getText();
        Assert.assertEquals(actual, error);
    }

    @Test
    public void noattll() {


        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx ");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String error = "Invalid Login or Password.";
        String actual = driver.findElement(By.id("ctl00_MainContent_status")).getText();
        Assert.assertEquals(actual, error);
    }
}