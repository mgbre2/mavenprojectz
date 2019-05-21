package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class Good {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");


    }

    @Test
    public void test() {
        System.out.println(driver.getWindowHandles().size());
        System.out.println(driver.getWindowHandles());
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println(driver.getWindowHandles().size());
        Set<String> handls = driver.getWindowHandles();
        for (String handle : handls) {
            System.out.println(handle);
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
            if (driver.getTitle().equals("New Window")){
                break;

            }


        }
        Assert.assertEquals(driver.getTitle(),"New Window");
        Assert.assertNotEquals( driver.getTitle(),"The Internet");
    }
}