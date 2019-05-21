package com.cybertek.tests;

import com.prestashop.utilities.Driver;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class expenesss {
    WebDriver driver;

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://52.39.162.23/");


        WebElement broe = driver.findElement(By.linkText("BriteErpDemo"));
        broe.click();

        WebElement email = driver.findElement(By.id("login"));
        email.sendKeys("in_ex_manager2@info.com");
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("LLighg89");
        WebElement longin = driver.findElement(By.xpath("(//button)[2]"));

        longin.click();
    }

@Test
        public void test(){


        WebElement expense = driver.findElement(By.linkText("Expenses"));
expense.click();


        /*
        WebElement expensesReportsanalyist= driver.findElement
                (By.partialLinkText("Expenses Reports"));
        expensesReportsanalyist.click();
        WebElement expesesanalysit= driver.findElement
                (By.linkText("Expenses Analysis"));
        expesesanalysit.click();
        WebElement expenseproduct =driver.findElement
                (By.linkText("Expense Products"));
        expenseproduct.click();
        WebElement Expensereport =driver.findElement
                (By.linkText("Expense Reports"));
        Expensereport.click();
        WebElement ExpenseReport =driver.findElement
                (By.linkText("Refused Reports"));
        ExpenseReport.click();
*/



        WebElement exrntorep= driver.findElement
                (By.linkText("Expense Reports To Approve"));
        exrntorep.click();
       WebElement create= driver.findElement
        (By.xpath("//button[@accesskey='c']"));

        create.click();


        WebElement impor= driver.findElement
                (By.xpath("//button[contains(text(),'Import')]"));

        impor.click();

    // WebElement addanitem = driver.findElement(By.xpath("//a[@href='#'])[72]"));



/*
    WebElement summarybox = driver.findElement
           (By.xpath("(//input[@type='text'])[4]"));
    summarybox.sendKeys("expense for lunch");


WebElement employee = driver.findElement(By.xpath("(//input[@type='text'])[5]"));

employee.click();

WebElement save = driver.findElement
        (By.xpath("//button[@accesskey='s']"));
save.click();

    WebElement approve= driver.findElement(By.xpath
            ("//button [@class='btn btn-sm btn-default'][1]"));
    approve.click();

    WebElement refuse= driver.findElement(By.xpath
            ("//button [@class='btn btn-sm btn-default'][5]"));


*/

       /*
        WebElement impor= driver.findElement
                (By.xpath("//button[contains(text(),'Import')]"));

        //impor.click();



        WebElement search = driver.findElement(By.className("o_searchview_input"));
    // search.click();


    WebElement discard = driver.findElement(By.xpath
         ("//button[contains(text(),'Discard')]"));
      */

   // WebElement addanitem = driver.findElement(By.xpath
           // ("(//a['Add an item'])[67]"));





    //WebElement summery = driver.findElement(By.className
            //("//input[@name='name']"));
    /*
    summery.sendKeys("expense for lunch");

    WebElement eployee = driver.findElement
            (By.className("o_input ui-autocomplete-input"));
    eployee.click();
    WebElement demouser = driver.findElement(By.xpath("//a[.='Demo User']"));
    demouser.click();

    WebElement approve= driver.findElement(By.xpath("//button[contains(text(),'Approve')]"));

approve.click();

    WebElement cancel =driver.findElement
            (By.className("btn btn-sm btn-default o_import_cancel"));

//cancel.click();
*/
    }
}
