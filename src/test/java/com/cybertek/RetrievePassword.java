package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievePassword {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //step 2 go to url "https://google.com"
        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/forgot_password");



        WebElement email = driver.findElement(By.tagName("input"));

        email.sendKeys("example@gmail.com");

        WebElement button = driver.findElement(By.tagName("button"));

        button.click();

        WebElement sent= driver.findElement(By.id("content"));

        String actualsent= sent.getText();
        String expexted="Your e-mail's been sent!";
        if (expexted.equals(actualsent)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
            System.out.println("expedted= "+expexted);
            System.out.println("actual="+actualsent);

        }
    }
}

