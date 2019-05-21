package com.cybertek;
/*
Project Name : Hunting Harley Davidson 1200 at Craigslist
Step 1: open a Chrome browser
Step 2: go to the URL "https://houston.craigslist.org/"
Step 3: insert 20 s implicitly wait command in case you have a slow connection
Step 4: Create a Web element to locate and click on the link "motorcycles" and click it on
Step 5: Create a Web element to locate and fill the "miles" text box by "30"
Step 6: Create a Web element to locate and fill the "ZIP" text box by "77498"
Step 7: Create a Web element to locate and fill the "min price" text box by "1500"
Step 8: Create a Web element to locate and fill the "make and model " text box by "harley davidson 1200"
Step 9: Create a Web element to locate and get the total number of  "harley davidson 1200" models in String format
Step 10: Convert the the total number of  "harley davidson 1200" models from String to int
Step 11: Create a Web element to locate and click to navigate into the page of first motorcycle
Step 12: Create an ArrayList to store the prices of motorcycles in String format
Step 13: Loop through all pages by clicking on the next link and collect price data and store into the ArrayList
Step 14: Print out the list of the prices of all motorbikes
Step 15: Create an int minPrice and loop through the ArrayList to find and assign the minimum price
        note that the prices are in String format and must be converted into int
Step 16: Print out the min price
Step 17: Loop through all pages by navigating back to find the page where the motorcycle with min price is and
        locate the reply button and click it on  and then locate and  get the phone number and print it out
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class trying {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();


driver.manage().window().fullscreen();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

driver.get("https://houston.craigslist.org/");

 //Step 4: Create a Web element to locate and click on the link "motorcycles" and click it on
       // WebElement motorcyclesLink = ((ChromeDriver) driver).findElementByLinkText("motorcycles");
       // motorcyclesLink.click();
             WebElement motorcyclesLink = driver.findElement(By.xpath("(//span[@class='txt'])[139]"));
             motorcyclesLink.click();
             WebElement mail=driver.findElement(By.xpath("(//span[@class='searchfieldlabel'])[1]"));
             mail.sendKeys("30");
             WebElement zipe =driver.findElement(By.className("flatinput searchInput postal"));
             zipe.sendKeys("77498");



/*

//Step 5: Create a Web element to locate and fill the "miles" text box by "30"
        WebElement mile = driver.findElement(By.name("search_distance"));
        mile.sendKeys("30");




//Step 6: Create a Web element to locate and fill the "ZIP" text box by "77498"
        WebElement zipCode = ((ChromeDriver) driver).findElementByName("postal");
        zipCode.sendKeys("77498");



//Step 7: Create a Web element to locate and fill the "min price" text box by "1500"
        WebElement minPriceBox = ((ChromeDriver) driver).findElementByName("min_price");
        minPriceBox.sendKeys("1500");



//Step 8: Create a Web element to locate and fill the "make and model " text box by "harley davidson 1200"
        WebElement model= ((ChromeDriver) driver).findElementByClassName("auto_make_model");
model.sendKeys("harley davidson 1200");
model.submit();

//Step 9: Create a Web element to locate and get the total number of  "harley davidson 1200" models in String format
        WebElement totalCountBox = ((ChromeDriver) driver).findElementByClassName("totalcount");
        System.out.println(totalCountBox.getText());


//Step 10: Convert the the total number of  "harley davidson 1200" models from String to int
        int totalCountNum = Integer.valueOf(totalCountBox.getText());
        System.out.println(totalCountNum);




*/
    }
}