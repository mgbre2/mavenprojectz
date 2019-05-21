package gov.census.Pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void openHomePage(){
        Driver.getDriver().get("https://census.gov/");
    }

//    @FindBy(id = "data-uscb-header-nav-item-link-2")
//    public WebElement browseByTopic;

    @FindBy(xpath = "(//div[@class=\"uscb-header-nav-item uscb-layout-row uscb-layout-align-center-center\"])[1]")
    public WebElement browseByTopic;

    @FindBy(xpath = "(//div[@class=\"uscb-header-nav-item uscb-layout-row uscb-layout-align-center-center\"])[2]")
    public WebElement exploreData;

    @FindBy(xpath = "(//div[@class=\"uscb-header-nav-item uscb-layout-row uscb-layout-align-center-center\"])[3]")
    public WebElement library;

    @FindBy(xpath = "(//div[@class=\"uscb-header-nav-item uscb-layout-row uscb-layout-align-center-center\"])[4]")
    public WebElement surveyPrograms;

    @FindBy(xpath = "(//div[@class=\"uscb-header-nav-item uscb-layout-row uscb-layout-align-center-center\"])[5]")
    public WebElement informationFor;

    @FindBy(xpath = "(//div[@class=\"uscb-header-nav-item uscb-layout-row uscb-layout-align-center-center\"])[6]")
    public WebElement findACode;

    @FindBy(xpath = "(//div[@class=\"uscb-header-nav-item uscb-layout-row uscb-layout-align-center-center\"])[7]")
    public WebElement aboutUs;


}

