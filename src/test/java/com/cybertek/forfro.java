package com.cybertek;


import com.cybertek.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*
        1.Open browser
        2.Goto http://zero.webappsecurity.com/login.html
        3.Enter username username
        4.Enter password password
        5.Click sign in button
        6.Verify usernameis displayed on page
        7.Verifythe title Zero -Account Summary

*/
public class forfro extends TestBase {
    @Test
    public void test1() {
        login();
        WebElement table = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
        System.out.println(table.getText());
    }

    public void login() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        driver.findElement(By.id("ctl00_MainContent_username")).
                sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).
                sendKeys("test" + Keys.ENTER);

    }

    @Test
    public void test2() {
        login();

        List<WebElement> headers = driver.findElements
                (By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));
        System.out.println(headers.size());


        for (WebElement header : headers) {
            System.out.println(header.getText());


        }
        System.out.println("row number " + 4);
        System.out.println(headers.get(3).getText());
    }
}








