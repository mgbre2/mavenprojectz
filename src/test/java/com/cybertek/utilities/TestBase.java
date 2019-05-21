package com.cybertek.utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public  abstract class TestBase {

    protected WebDriver driver;

    protected Actions actions;

    protected SoftAssert softAssert;

    public String url="https://www.freecrm.com/index.html";

    public Faker fake;

    @BeforeClass
    public void setUpClass() {

        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUpMethod() {
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //WebDriverManager.chromedriver().setup();
       //driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        fake = new Faker();

        actions = new Actions(driver);

        softAssert = new SoftAssert();
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
          //driver.quit();
       // Driver.closeDriver();
        softAssert.assertAll();

            Thread.sleep(4000);



    }
}
