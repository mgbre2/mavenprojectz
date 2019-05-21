package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumEver {
    public static void main(String[] args) {
    //step 1 open chrom
      WebDriverManager.chromedriver().setup();
    //step 2 go to url "https://google.com"
    WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    //step 3 verify title
    //expected title :google


    String actualTitle =driver.getTitle();
        System.out.println("actualTitle =" +actualTitle );

    String expectedTitle="Google";
        if (expectedTitle.equals(actualTitle)){
        System.out.println("pass");

    }else{
        System.out.println("Fail");
        System.out.println("expected ="+expectedTitle);
        System.out.println("Actual=" +actualTitle);

    }

}
    }

