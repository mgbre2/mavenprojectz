package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.nio.file.Watchable;
import java.util.List;


public class friend extends TestBase {
    @Test
    public void printWholeTable() {
        login();
        WebElement table = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
        System.out.println(table.getText());
    }

    public void login() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");

        driver.findElement(By.id("ctl00_MainContent_username")).
                sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).
                sendKeys("test" + Keys.ENTER);


    }

    @Test
    public void Header() {
        login();
        List<WebElement> headers = driver.
                findElements(By.xpath("//table[@ id='ctl00_MainContent_orderGrid']//th"));
        for (WebElement header : headers) {
            System.out.println(header.getText());
        }
    }

    @Test
    public void rows() {
        login();
        List<WebElement> allrows = driver.
                findElements(By.xpath("//table[@id ='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println(allrows.size());
        for (WebElement allrow : allrows) {
            System.out.println(allrow.getText());


        }
        System.out.println("row 4 =");
        System.out.println(allrows.get(3).getText());
    }

    @Test
    public void column() {
        login();
        List<WebElement> rows = driver.findElements(By.xpath
                ("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println("the row size=" + rows.size());
        List<WebElement> headersize = driver.findElements(By.xpath(
                "//table[@id='ctl00_MainContent_orderGrid']//th"));
        System.out.println("the size of the header =" + headersize.size());
    }

    @Test
    public void row2() {
        login();
        List<WebElement> row1 = driver.findElements
                (By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println(row1.get(4).getText());


    }

    @Test
    public void cell() {
        login();

        WebElement cell = driver.findElement
                (By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[4]/td[4]"));
        System.out.println(cell.getText());

    }
    @Test
    public void col(){
        login();
        List<WebElement> cols = driver.findElements(By.xpath(
                "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[4]"));
        for ( WebElement col :cols){
            System.out.println(col.getText());
        }
    }



}
