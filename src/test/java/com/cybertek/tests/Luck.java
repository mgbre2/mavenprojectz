package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Luck {
    WebDriver driver;
    WebElement product;
    WebElement price;
     String productName;
    String productPrice ;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        product = driver.findElement(By.linkText("Blouse"));
        productName = product.getText();

        price = driver.findElement(By.xpath("(//span[@class='price product-price'])[4]"));
        productPrice = price.getText();
    }

    @Test
    public void productInformationPrice() {
        //Click on any product
        product.click();

        //VERIFY that same name and price displayed as on the homepage
        WebElement productPageName = driver.findElement(By.xpath("//h1[.='Blouse']"));
        WebElement productPagePrice = driver.findElement(By.xpath("//span[@id='our_price_display']"));

        System.out.println("Homepage product name: " + productName + " | Product page product name: " + productPageName.getText());
        System.out.println("Homepage product price: " + productPrice + " | Product page product price: " + productPagePrice.getText());

        Assert.assertEquals(productPageName.getText(), productName);
        Assert.assertEquals(productPagePrice.getText(), productPrice);
    }
    @Test
    public void test1(){
        product.click();

        WebElement quantity= driver.findElement(By.id("quantity_wanted"));
        if (!quantity.isSelected()){
            System.out.println("1 is not sellected");
        }else {
            System.out.println("1 is sellected");
        }

    }


}
