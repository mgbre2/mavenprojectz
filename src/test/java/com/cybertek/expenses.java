package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class expenses {
    public static void main(String[] args) {

        // setting driver path for chrome using the webdriver manager
        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://52.39.162.23/");

        WebElement broe = driver.findElement(By.linkText("BriteErpDemo"));
                broe.click();

        WebElement email = driver.findElement(By.id("login"));
        email.sendKeys("in_ex_manager2@info.com");
       WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("LLighg89");
             WebElement longin= driver.findElement(By.xpath("(//button)[2]"));

              longin.click();

        WebElement expense = driver.findElement(By.linkText("Expenses"));

        expense.click();
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


        WebElement exrntorep= driver.findElement
                (By.linkText("Expense Reports To Approve"));
       // WebElement expesesummit= driver.findElement
        ////        (By.xpath("//a[@class='oe_menu_leaf'])[13]"));
       // expesesummit.click();





        WebElement create= driver.findElement
                (By.xpath("//button[contains(text(),'Create')]"));
        create.click();
        WebElement impor= driver.findElement
                (By.xpath("//button[contains(text(),'Import')]"));
        impor.click();
WebElement search = driver.findElement(By.className("o_searchview_input"));
search.click();
WebElement approve = driver.findElement(By.className
        ("btn btn-sm btn-default oe_highlight o_expense_sheet_approve"));
approve.click();

       /*

        @FindBy(linkText = "Expenses")
        public WebElement expenses;

        @FindBy (partialLinkText = "Expenses Reports")
        public WebElement expensesReportsToAnalysis;


        @FindBy (linkText = "Expenses Analysis")
        public WebElement expenseAnalysis;


        @FindBy (linkText = "Expense Products")
        public WebElement expenseProduct;


        @FindBy (linkText = "Expense Reports")
        public WebElement expenseReport;



        @FindBy (linkText = "Expense Reports To Approve")
        public WebElement expenseReportsToApproves;


        @FindBy (linkText = "Refused Reports")
        public WebElement refusedReports;

        //@FindBy (xpath= "//a[@class='oe_menu_leaf'])[13]")
        //public WebElement expesesummit;


        public void ExpenseClick(){
            expenses.click();
            expensesReportsToAnalysis.click();
            expenseAnalysis.click();

            expenseProduct.click();
            expenseReport.click();
            expensesReportsToAnalysis.click();
            refusedReports.click();
            //expesesummit.click();


*/

        }


    }

