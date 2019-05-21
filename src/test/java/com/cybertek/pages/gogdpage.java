package com.cybertek.pages;

import com.cybertek.tests.Project.TestBase;
import com.cybertek.utilities.Driver;
import com.prestashop.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class gogdpage extends TestBase {
    @Test
    public void test(){
        driver.get(ConfigurationReader.getProperty("url"));
    }
}

