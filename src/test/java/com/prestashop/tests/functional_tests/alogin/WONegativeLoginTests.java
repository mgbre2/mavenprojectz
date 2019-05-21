package com.prestashop.tests.functional_tests.alogin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WONegativeLoginTests {
    WebDriver driver;


    @BeforeMethod
    public void setting(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void verifyTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders Login";
        System.out.println(driver.getTitle());

        System.out.println("Expected Title: " + expectedTitle + " | Actual Tile: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);

        String savedURL="http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
    }

    @Test
    public void wrongUserName(){
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Test");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String actualTitle= driver.getTitle();
        String expectedTitle= "Web Orders";

        System.out.println("Expected Title: "+expectedTitle+" | Actual Tile: "+actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);

        String currentURL=driver.getCurrentUrl();
        String savedURL="http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";

        System.out.println("Expected URL: "+savedURL+" | Actual URL: "+currentURL);
        Assert.assertEquals(currentURL, savedURL);

    }
}