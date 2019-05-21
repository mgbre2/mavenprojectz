package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
1. Open	browser
2. Go	to	website
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/
login.aspx
3. Verify	title	equals	“Web	Orders	Login”
4. Enter	username	“Tester”
5. Enter	password	“test”
6. Click	on	Login	button
7. Verify	title	equals	“Web	Orders”
8. Verify	url	equals
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/
 */

public class PositiveLoginTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/\n" +
                "login.aspx");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders Login";

        if (actualTitle.equals(expectedTitle)) {
            System.out.print("pass");
        } else {
            System.out.print("fail");
            System.out.print("expected =" + expectedTitle);
            System.out.print("actaul =" + actualTitle);
            WebElement email = driver.findElement(By.id("ctl00_MainContent_username"));

            email.sendKeys("Tester");
            WebElement pass = driver.findElement(By.id("ctl00_MainContent_password"));

            pass.sendKeys("test");
            WebElement click = driver.findElement(By.id("ctl00_MainContent_login_button"));

            click.click();

            String atualTitle1 = driver.getTitle();

            String expectedTitle1 = "Web Orders";

            if (atualTitle1.equals(expectedTitle1)) {
                System.out.print("pass");
            } else {
                System.out.print("fail");
                System.out.print("expected =" + expectedTitle1);
                System.out.print("actaulTitle =" + atualTitle1);

            }

            String atualTilte2 = driver.getCurrentUrl();

            String expetedTilte2 = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/";

            if (atualTilte2.equals(expetedTilte2)) {
                System.out.print("pass");
            } else {
                System.out.print("fail");
                System.out.print("expected =" + expetedTilte2);
                System.out.print("actual =" + atualTilte2);
            }
        }
    }






}
