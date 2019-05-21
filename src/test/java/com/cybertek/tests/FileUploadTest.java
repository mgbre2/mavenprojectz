package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cybertek.utilities.TestBase;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {
    @Test
    public void fileUpload(){


        driver.get("http://the-internet.herokuapp.com/upload");



        //have to upload the file from my computer but first i need to locate the element
        WebElement chooseFile = driver.findElement(By.id("file-upload"));


        String pathOfMyFile = "/Users/mussietewolde/Downloads/test.txt";
        chooseFile.sendKeys(pathOfMyFile);

/*
String messageVerify = messageVerifyElement.getText();

        String exptectedMessage = "File Uploaded!";

        Assert.assertEquals(messageVerify,exptectedMessage);

*/

       driver.findElement(By.id("file-submit")).click();
        Assert.assertTrue(
               driver.findElement(By.xpath("//*[.='File Uploaded!']")).isDisplayed());


    }

}
