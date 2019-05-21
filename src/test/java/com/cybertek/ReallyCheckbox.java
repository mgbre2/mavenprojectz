package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
go to http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox
verify monday is not selected
select monday
verify monday is selected
unselect monday

 */
public class ReallyCheckbox {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        WebElement monday = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));

       // System.out.println(monday.isSelected());
        //monday.click();
       // System.out.println(monday.isSelected());
       //monday.click();
       // System.out.println(monday.isSelected());

       System.out.println(monday.isSelected());
        if (!monday.isSelected()){
           monday.click();
        }
        System.out.println(monday.isSelected());

        WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
System.out.println(tuesday.isSelected());
if (!tuesday.isSelected()){
    tuesday.click();
}
System.out.println(tuesday.isSelected());

    }
}
