package com.cybertek.utilities;
//import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class freeCRMTests extends TestBase{







    @Test
    public void signUp() {

        driver.findElement(By.linkText("Sign Up")).click();


        Select select = new Select(driver.findElement(By.id("payment_plan_id")));
        select.selectByIndex(1);

        //WebElements
        WebElement firstName = driver.findElement(By.name("first_name"));


        WebElement lastName = driver.findElement(By.name("surname"));
        WebElement email = driver.findElement(By.name("email"));
        WebElement emailConfirm = driver.findElement(By.name("email_confirm"));


        WebElement username = driver.findElement(By.name("username"));

        WebElement password = driver.findElement(By.name("password"));
        WebElement confirmPassword = driver.findElement(By.name("passwordconfirm"));
        WebElement agreeTemrs = driver.findElement(By.name("agreeTerms"));
        WebElement submitButton = driver.findElement(By.id("submitButton"));


        //Fake Information
        String fakeFirstName = fake.name().firstName();
        String fakeLastName = fake.name().lastName();
        String fakeemail = fake.name().username() + "@gmail.com";
        String fakeUsername = fakeFirstName + fake.number().digit();
        String fakepassword = "password123";

        firstName.sendKeys(fakeFirstName);
        lastName.sendKeys(fakeLastName);
        email.sendKeys(fakeemail);
        emailConfirm.sendKeys(fakeemail);
        username.sendKeys(fakeUsername);
        password.sendKeys(fakepassword);
        confirmPassword.sendKeys(fakepassword);


        agreeTemrs.click();
        submitButton.click();

        //Second page Company information
        //WebELements on Second Page
        WebElement company = driver.findElement(By.name("company_name"));
        WebElement phone = driver.findElement(By.id("phone"));
        WebElement checkBox2 = driver.findElement(By.name("copy_address"));
        WebElement continueButton = driver.findElement(By.name("btnSubmit"));


        company.sendKeys(fake.company().name());
        phone.sendKeys(fake.phoneNumber().phoneNumber());
        checkBox2.click();
        continueButton.click();

        driver.findElement(By.name("finish")).click();

       // String expected = driver.findElement(By.xpath("//div[@class='text_orange']")).getText();
       // System.out.println(expected);
        //Assert.assertEquals(expected, "Your account is now registered.", "it does not match" + expected);
        String actual = driver.findElement(By.xpath("//div[@class='text_orange']")).getText();

        String expected ="Your account is now registered.";
        System.out.println("actual result is"+actual +"|"+"expected result is "+ expected);
        Assert.assertEquals(expected,actual);
    }


}

