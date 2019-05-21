//package gov.census.utilities;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//import java.util.concurrent.TimeUnit;
//
//public class Driver {
//
//
//    protected WebDriver driver;
//    protected Actions actions;
//
//    @BeforeMethod
//    public void setUpBeforeMothod(){
//        //driver= Driver.getDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        actions= new Actions(driver);
//
//    }
//
//    @AfterMethod
//    public void tearDownMethod(){
//        // Driver.closeDriver();
//    }
//
//
//
//}