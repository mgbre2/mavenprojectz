package com.cybertek.utilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;

public class EtsyWithSoftAsset extends TestBase{



    @Test
    public void test() {
        driver.get("https://etsy.com");
       driver.findElement(By.id("search-query")).sendKeys("gift" + Keys.ENTER);

        softAssert.assertTrue(driver.getTitle().contains("gift"), "title did not match");

        Assert.assertTrue(driver.getTitle().contains("AAA"));



    }}
