package com.cybertek;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
);
*/
public class Try {




    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement search =driver.findElement(By.id("dropdown"));

        Select list = new Select(search);
        String fristop = list.getFirstSelectedOption().getText();
        System.out.println(fristop);

        List<WebElement> options = list.getOptions();
        System.out.println("option size = " +options.size());

        for ( WebElement option :options){
             System.out.println(option.getText());


        }

        list.selectByIndex(2);
        System.out.println("option 2 = "+list.getFirstSelectedOption().getText());
        list.selectByValue("1");
        System.out.println("option 1 = "+list.getFirstSelectedOption().getText());
    }

}

