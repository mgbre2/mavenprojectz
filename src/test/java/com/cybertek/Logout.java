package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //step 2 go to url "https://google.com"
        WebDriver driver = new ChromeDriver();


        driver.get("http://a.testaddressbook.com/sign_in");


        WebElement inputEmail = driver.findElement(By.id("session_email"));
        inputEmail.sendKeys("kexesobepu@zsero.com");

        WebElement inputPassword =  driver.findElement(By.id("session_password"));
        inputPassword.sendKeys("password");

        WebElement signinButton = driver.findElement(By.name("commit"));
        signinButton.click();




        WebElement lougOutLink = driver.findElement(By.className("nav-item nav-link"));
        lougOutLink.click();
        WebElement homeLink = driver.findElement(By.partialLinkText("Hom"));
       // WebElement homeLink = driver.findElement(By.partialLinkText("Hom"));
        homeLink.click();

    }
}



