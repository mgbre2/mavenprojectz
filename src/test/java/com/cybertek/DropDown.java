package com.cybertek;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.get("https://the-internet.herokuapp.com/dropdown");


        // 1. we have to locate an element with tag select
        WebElement selectElement = driver.findElement(By.id("dropdown"));

        // 2. create select object using the webelement
        Select list = new Select(selectElement);

        // print the selected option
        String selectedOption = list.getFirstSelectedOption().getText();
        System.out.println(selectedOption);

        // print all available options

        List<WebElement> options = list.getOptions();
        System.out.println("options.size() = " + options.size());

        for (WebElement option:options) {
            System.out.println(option.getText());
        }

        // select different options
        // 1. by visible text
        list.selectByVisibleText("Option 1");
        System.out.println("Selected option:   " +
                list.getFirstSelectedOption().getText());

        // 2. by visible index, count is 0 based
        list.selectByIndex(2);
        System.out.println("Selected option:   " +
                list.getFirstSelectedOption().getText());

        // 3. by value attribute
        list.selectByValue("1");
        System.out.println("Selected option:   " +
                list.getFirstSelectedOption().getText());
/*

public class DepartmentsTest {


    WebDriver driver;
    Select allDepartments;

    @BeforeClass
    public void setUpMethod() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://amazon.com");
    }


    // verify that default dropdown option is all
    @Test (priority = 0)
    public void testDefaultValue() {
        // finding the element with a select tag
        WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));
        // create a Select class object
        allDepartments = new Select(selectElement);
        // get the current selected option
        String selectedOption = allDepartments.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption, "All");

    }

    //    4.verify that all options are sorted alphabetically
    @Test (priority = 1)
    public void sortAlphabetical(){
        // using the compare to method, we will compare each element in the list to the next one

        for (int i = 0; i < allDepartments.getOptions().size()-1; i++) {
            String current = allDepartments.getOptions().get(i).getText();
            String next = allDepartments.getOptions().get(i+1).getText();

            System.out.println("comparing: " + current + " with "+  next);

            Assert.assertTrue(current.compareTo(next)<=0);

        }
    }
// 5.Click on the menu icon on the left
//    6.click on Full Store directory
//      7.capture all of the main department names in the page.
//     8.verify that departments names are sorted alphabetically

    @Test
    public void mainDepartmentsTest() throws InterruptedException {
//        5.Click on the menu icon on the left

        driver.findElement(By.cssSelector("i.hm-icon.nav-sprite")).click();

        // click on Full Store directory
        // waiting because it is taking time for element to load and be clickable
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='/gp/site-directory?ref_=nav_em_T1_0_2_2_33__fullstore']")).click();

        // capture all of the main department names in the page.

        List<WebElement> mainDepts = driver.findElements(By.cssSelector("h2.fsdDeptTitle"));

        for (WebElement option :
                mainDepts) {
            System.out.println(option.getText());
        }
    }


    @AfterClass
    public void tearDown(){
//        driver.quit();
    }
}


*/
    }
}
