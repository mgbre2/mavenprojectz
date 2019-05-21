package com.cybertek;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Sport {

    public static void main(String[] args) {

        /*SPORTS
        1. open browser
        2. go to http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton
        3. verify that Football is selected by default and all others are not selected.
        4. Select a random sport
        5. Verify that all other options are not selected*/


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton");

        driver.manage().window().fullscreen();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement football = driver.findElement(By.xpath("//input[@id='gwt-debug-cwRadioButton-sport-Football-input']"));

        if (!football.isSelected()){
            System.out.println("Football is not selected");
            football.click();
        } else {
            System.out.println("Football is selected");
        }

        WebElement baseball = driver.findElement(By.xpath("//input[@id='gwt-debug-cwRadioButton-sport-Baseball-input']"));

        if (!baseball.isSelected()){
            System.out.println("Checked !!! Baseball is not selected");
        } else {
            System.out.println("There is a Bug,  Baseball is somehow selected");
        }

        WebElement basketball = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Basketball-input"));


        if (!basketball.isSelected()){
            System.out.println("Checked !!! Basketb is not selected");
        } else {
            System.out.println("There is a Bug, Basketball is somehow selected");
        }

        WebElement hockey = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Hockey-input"));

        if (!hockey.isSelected()){
            System.out.println("Checked !!! Hockey is not selected");
        } else {
            System.out.println("There is a Bug, Hockey is somehow selected");
        }

        WebElement soccer = driver.findElement(By.xpath("//input[@id='gwt-debug-cwRadioButton-sport-Soccer-input']"));

        if (!soccer.isSelected()){
            System.out.println("Checked !!! Soccer is not selected");
        } else {
            System.out.println("There is a Bug, Soccer is somehow selected");
        }

        WebElement waterpolo = driver.findElement(By.xpath("//input[@id='gwt-debug-cwRadioButton-sport-WaterPolo-input'][@name='sport']"));

        if (!waterpolo.isSelected()){
            System.out.println("Checked !!! Water Polo is not selected");
        } else {
            System.out.println("There is a Bug, Water Polone is somehow selected");
        }

        Random random = new Random();

        int temp = random.nextInt(5);

        ArrayList<WebElement> sport = new ArrayList<WebElement>();

        sport.add(football);
        sport.add(baseball);
        sport.add(basketball);
        sport.add(soccer);
        sport.add(hockey);
        sport.add(waterpolo);

        WebElement sportRandom = sport.get(temp);

        for (int idx = 0; idx < sport.size(); idx++){

            if (sportRandom == football){
                football.click();
                System.out.println("Football is selected randomly");
                break;
            }

            if (sportRandom == baseball){
                baseball.click();
                System.out.println("Baseball is selected randomly");
                break;
            }

            if (sportRandom == basketball){
                basketball.click();
                System.out.println("Basketball is selected randomly");
                break;
            }

            if (sportRandom == hockey){
                hockey.click();
                System.out.println("Hockey is selected randomly");
                break;
            }

            if (sportRandom == soccer){
                soccer.click();
                System.out.println("Soccer is selected randomly");
                break;
            } else {
                waterpolo.click();
                System.out.println("Water Polo is selected randomly");
            }



        }

    }
}