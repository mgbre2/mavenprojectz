package com.cybertek.tests;

import com.cybertek.Try;
import com.cybertek.tests.Project.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTextDisapearTest extends TestBase {


    @Test
    public void verify1() {
        driver.get("https:" +
                "//www.w3schools.com/howto/howto_js_toggle_hide_show.asp");

        WebElement text = driver.findElement(By.id("myDIV"));

         // WebElement text1 = driver.findElement(By.xpath("//div[@id=‘myDIV’]"));
          System.out.println(text.getText());
        // System.out.println(text1.getText());

        Assert.assertTrue(text.isDisplayed());

        WebElement button = driver.
              findElement(By.xpath("//button[.='Toggle Hide and Show']"));


        button.click();
       Assert.assertFalse(text.isDisplayed());



    }

    @Test
    public void verify2() {
        driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_html_remove");

        driver.switchTo().frame("iframeResult");//some have them iframe;so that is the
        //only way do it.
        WebElement test = driver.findElement(By.xpath("//body/p"));

        // System.out.println(test.getText());
        Assert.assertTrue(test.isDisplayed());


        WebElement button = driver.findElement(By.xpath("//body/button"));
        button.click();

        //Assert.assertFalse(button.isDisplayed());//error

        Assert.assertFalse(elementDisplayed(By.xpath("/body/p")));


    }


    public boolean elementDisplayed(By by) {

        try {


            return driver.findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }



    }

   // public boolean elementDisplayeds(By by){
       // return driver.findElement(by).isEmpty();


    //}

}
