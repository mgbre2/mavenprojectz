package gov.census.Tests;

import gov.census.Pages.HomePage;
import gov.census.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestLibrary extends TestBase {

    public List<WebElement> openPage(){
        HomePage homePage= new HomePage();
        homePage.openHomePage();
        actions.click().perform();

        homePage.library.click();

        List<WebElement> headersElement= driver.findElements(By.xpath("//div[@id='data-uscb-header-dropdown-links-2']//a"));

        return headersElement;
    }

    @Test
    public void libraryTest_p(){

        List<WebElement> headersElement= openPage();

        List<String> expectedHeagerNames= Arrays.asList(new String[]{"Library Main","America Counts: Stories",
                "Audio","Infographics and Visualizations","Photos","Publications","Videos","Working Papers"});

        for (int i=0; i<headersElement.size(); i++){
            String actualHeaderName=headersElement.get(i).getText();
            String expectedlHeaderName= expectedHeagerNames.get(i);

            System.out.println("actualHeaderName = " + actualHeaderName);
            System.out.println("expectedHeagerNames = " + expectedlHeaderName);

            Assert.assertEquals(actualHeaderName,expectedlHeaderName);

        }




    }


    @Test
    public void libraryTest_N(){

        List<WebElement> headersElement= openPage();


        String expectedName="Census Careers";
        for (int i=0; i<headersElement.size(); i++){
            String actualHeaderName=headersElement.get(i).getText();

            System.out.println("actualHeaderName = " + actualHeaderName);
            System.out.println("expectedHeagerNames = " + expectedName);

            Assert.assertNotEquals(actualHeaderName,expectedName);

        }




    }


}


