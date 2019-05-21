package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLink {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/");
    WebElement File  = driver.findElement(By.linkText("File Download"));
    WebElement File2  = driver.findElement(By.linkText("Dynamic Content"));
    WebElement internate = driver.findElement(By.className("heading"));

}
}


