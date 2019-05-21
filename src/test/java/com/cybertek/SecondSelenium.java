package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

       // WebDriver driver =new FirefoxDriver();
        WebDriver driver =new ChromeDriver();


        driver.get("http://eatsy.com");


        driver.navigate().to("http://amazon.com");

          driver.navigate().back();

         driver.navigate().forward();

    }
}


