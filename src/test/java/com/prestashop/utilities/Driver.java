package com.prestashop.utilities;
import com.cybertek.tests.LoginTestWithProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
    private static WebDriver driver;

    private Driver(){} //lock Driver object to be created by others

    public static WebDriver getDriver(){
        if(driver == null){
//            WebDriverManager.chromedriver().setup();
////            driver = new ChromeDriver();
            String browser =ConfigurationReader.getProperty("browser");
            switch (browser.trim()) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;


                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;


//                case "safari":
//                    WebDriverManager.safaridriver().setup();
//                    driver = new SafariDriver();
//                    break;


                default:

                    WebDriverException issue= new WebDriverException();
                    throw issue;

            }
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}

