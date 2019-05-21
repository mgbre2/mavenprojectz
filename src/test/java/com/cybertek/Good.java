package com.cybertek;

/*
1. open browser
2. go to amazon
3. enter search term and submit
4. verify search box still contains the same search term
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Good {
    private static Event keys;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://amazon.com");
        String searchterm ="charger";
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys(searchterm +keys.ENTER);

        WebElement seachbox = driver.findElement(By.id("twotabsearchtextbox"));
        String actualseachbox = seachbox.getAttribute("value");
        String expectedseachbox ="charger";
        if ( actualseachbox.contains(expectedseachbox)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
    }
}
