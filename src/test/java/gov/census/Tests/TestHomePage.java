package gov.census.Tests;

import gov.census.Pages.HomePage;
import gov.census.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends TestBase {

    public void openPage(){
        HomePage homePage= new HomePage();
        homePage.openHomePage();
        actions.click().perform();
    }

    @Test
    public void urlTest_P(){
//        driver.get("https://www.census.gov/");
//        //driver.findElement(By.xpath("//button[@class=\"prefix-overlay-close prefix-overlay-action-later\"]")).click();
//        actions.click().perform();

        openPage();
        String ecpectedUrl="https://www.census.gov//";
        String actualUrl=driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("ecpectedUrl = " + ecpectedUrl);
        Assert.assertEquals(actualUrl,ecpectedUrl);

    }

    @Test
    public void urlTest_N(){

        openPage();
        String ecpectedUrl="https://www.census.com/";
        String actualUrl=driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("ecpectedUrl = " + ecpectedUrl);
        Assert.assertNotEquals(actualUrl,ecpectedUrl);

    }


    @Test
    public void titleTest_P(){

        openPage();

        String ecpectedUrl="Census.gov";
        String actualUrl=driver.getTitle();
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("ecpectedUrl = " + ecpectedUrl);
        Assert.assertEquals(actualUrl,ecpectedUrl);

    }

    @Test
    public void titleTest_N(){
        openPage();
        String ecpectedUrl="Census.com";
        String actualUrl=driver.getTitle();
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("ecpectedUrl = " + ecpectedUrl);
        Assert.assertNotEquals(actualUrl,ecpectedUrl);

    }


}



