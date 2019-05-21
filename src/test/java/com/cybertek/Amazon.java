package com.cybertek;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  /*

        1.Open browser
        2.Gotohttps://amazon.com
        3.check the search
        4.check the click
        5.verify the title expedted is the search term
         */

public class Amazon {


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        WebElement inputSearch = driver.findElement(By.id("twotabsearchtextbox"));

        WebElement inputButton = driver.findElement(By.className("nav-input"));

        inputButton.click();

        String atualTitle = driver.getCurrentUrl();
        System.out.println("atualTitle =" + atualTitle);


        String expectedTitle = ("the search term");
        System.out.println("expectedTitle =" + expectedTitle);

        if (expectedTitle.equals(atualTitle)) {

            System.out.println("pass");

        } else {
            System.out.println("fail");
            System.out.println("expetedTitle = " + expectedTitle);
            System.out.println("actualTitle = " + atualTitle);
        }


    }
}


