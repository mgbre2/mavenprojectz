package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tabletry {
    WebDriver driver =new ChromeDriver();
    @Test
    public void test1(){
        login();
        WebElement table = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
        System.out.println(table.getText());
    }

    public void login(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        driver.findElement(By.id("ctl00_MainContent_username")).
                sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).
                sendKeys("test"+ Keys.ENTER);

    }
    }

