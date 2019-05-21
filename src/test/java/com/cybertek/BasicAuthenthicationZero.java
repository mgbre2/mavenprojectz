package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenthicationZero {
     /*

        1.Open browser
        2.Gotohttp://zero.webappsecurity.com/login.html
        3.Enter usernameusername
        4.Enter password password
        5.Click sign in button
        6.Verify usernameis displayed on page
        7.Verifythe title Zero -Account Summary
        System.setProperty("webdriver.chrome.driver",
                "/Users/mussietewolde/Desktop/seleniumfolder/driver/chromedriver");

        WebDriver driver= new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");


        WebElement inputEmail = driver.findElement(By.id("user_login"));


        inputEmail.sendKeys(" username");

        WebElement inputPassword =driver.findElement(By.id("user_password"));

        inputPassword.sendKeys("password");

        WebElement signinButton= driver.findElement(By.name("submit"));

//System.out.println(driver.getTitle());

signinButton.click();

WebElement username =driver.findElement(By.className("dropdown-toggle"));

        String actualUsername = username.getText();

        System.out.println(actualUsername);

        // Verify username is displayed on page
        if ("dropdown-toggle".equals(actualUsername)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("EXPECTED: dropdown-toggle");
            System.out.println("actualUsername = " + actualUsername);
        }

        String actualTitle =driver.getTitle();
        System.out.println("actualTitle =" +actualTitle );

String expectedTitle= " Zero - Account Summary";

        if(expectedTitle.equals(actualTitle)){
            System.out.println("pass");

        }else {
            System.out.println("Fail");
            System.out.println("expected="+expectedTitle);
            System.out.println("actualTitle="+actualTitle);
        }
        */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");


        WebElement Email = driver.findElement(By.id("user_login"));
        Email.sendKeys("username");

        WebElement Password = driver.findElement(By.id("user_password"));

        Password.sendKeys("password");

        WebElement Button = driver.findElement(By.name("submit"));
        Button.click();
        driver.manage().window().fullscreen();

        // String actualtitle = driver.getCurrentUrl();
        // String extectedtitle= "Zero -Account Summary";
        // if  (actualtitle.equals(extectedtitle)){
        //  System.out.println("pass");
        //}else {
        //System.out.println("fail");
        //System.out.println("expedted ="+extectedtitle);
        // System.out.println("actual ="+ actualtitle);


        WebElement Username = driver.findElement(By.className("dropdown-toggle"));

        String actualusername = Username.getText();
        //System.out.println(actualusername);

        String expectedUsername = "username";
        if (expectedUsername.equals(actualusername)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
            System.out.println("expectedusername=" + expectedUsername);
            System.out.println("actualname=" + actualusername);

            String atualTitle = driver.getCurrentUrl();
            String expedtedTitle = " Zero - Account Summary";
            if (actualusername.equals(expectedUsername)){
                System.out.println("pass");
            }else {
                System.out.println("fail");
                System.out.println("expectedtitle ="+expedtedTitle);
                System.out.println("actualtitle= "+atualTitle);
            }

        }


    }

}

