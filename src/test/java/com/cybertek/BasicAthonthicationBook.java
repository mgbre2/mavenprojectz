package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAthonthicationBook {
      /*



        1.Open browser
        2.Go tohttp://a.testaddressbook.com/sign_in
        3.Enter
        usernamekexesobepu@zsero.com
        4.Enter password password
        5.Click sign in button
        6.Verify username is displayed on page
        7.Verifythe title does not include Sign In
         */
      public static void main(String[] args) {

          WebDriverManager.chromedriver().setup();


          WebDriver driver = new ChromeDriver();


          // HOW TO MAXIMIZE THE PAGE

          driver.manage().window().fullscreen();  // mac

//        driver.manage().window().maximize();  // windows

          driver.get("http://a.testaddressbook.com/sign_in");


          // finding element from page


          WebElement inputEmail = driver.findElement(By.id("session_email"));


          // enter the username
          inputEmail.sendKeys("kexesobepu@zsero.com");


          // find the password input box
          WebElement inputPassword = driver.findElement(By.id("session_password"));


          // enter password
          inputPassword.sendKeys("password");

          // locates the sign in button
          WebElement signinButton = driver.findElement(By.name("commit"));

          // System.out.println(driver.getTitle());


          // clicks on the button
          signinButton.click();

          // System.out.println(driver.getTitle());


          // located the username element
          WebElement username = driver.findElement(By.className("navbar-text"));


          String actualUsername = username.getText();
          System.out.println(actualUsername);

          // Verify username is displayed on page
          if ("kexesobepu@zsero.com".equals(actualUsername)) {
              System.out.println("PASS");
          } else {
              System.out.println("FAIL");
              System.out.println("EXPECTED: kexesobepu@zsero.com");
              System.out.println("actualUsername = " + actualUsername);
          }

          // verify title
          if (!driver.getTitle().contains("Sign In")) {
              System.out.println("PASS");
          } else {
              System.out.println("FAIL");
              System.out.println(driver.getTitle());
          }



          }
      }




