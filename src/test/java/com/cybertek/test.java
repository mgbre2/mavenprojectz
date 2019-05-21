package com.cybertek;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class test {
    public static  void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver =new FirefoxDriver();

driver.get("https://washingtondc.craigslist.org/");
driver.findElement(By.id("query")).sendKeys("corolla");
driver.findElement(By.partialLinkText("+garden")).click();

    }
}
