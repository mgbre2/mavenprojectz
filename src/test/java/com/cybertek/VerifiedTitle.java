package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*


How to test if google opens correcly 2
1. Open chrome browser
2. go to url "https://google.com"
3. Verify url
Expected url: "https://www.google.com/"
 */


public class VerifiedTitle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        String expectedUrl= "https://google.com";

        String actualUrl =driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("expected:"+expectedUrl);
            System.out.println("actualUrl = " + actualUrl);

        }


        // System.out.println(driver.getPageSource());//gets the HtMT of the page
    }
}


