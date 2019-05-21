package com.cybertek.tests.Project;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Faker faker;


    @BeforeClass
    public void beforeAllTests() {


    }

    @AfterClass
    public void afterAllTests() {

    }

    @BeforeMethod
    public void beforeEachTest() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        faker = new Faker();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void afterEachTest() {

        if (driver != null) {

           // driver.quit();
        }
    }

}


