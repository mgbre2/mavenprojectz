package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestDashBoard {
    public static void main(String[] args) {

        WebDriver driver;
       WebDriverManager.chromedriver().setup();

        driver= new ChromeDriver();
        driver.get("https://www.amazom.com/");
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);


        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Design Patterns: Elements"+ Keys.ENTER);
        //
        driver.findElement(By.xpath("//h2[text()='Design Patterns: Elements of Reusable Object-Oriented Software']/parent::a")).click();

        String title = driver.getTitle();
        String expectedTitle = "Design Patterns";

        String productTitle = driver.findElement(By.id("productTitle")).getText();
        String expectedProdTitle ="Design Patterns: Elements of Reusable Object-Oriented Software";

        // verify title
        if(title.contains(expectedTitle) && productTitle.equals(expectedProdTitle)){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }

    }
}


