package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.DriverClass;

public class LandingPage extends DriverClass
{

    public LandingPage()
    {
        PageFactory.initElements(driver, this);    
    }

    @FindBy(xpath = "//div[@class='keywordSugg']//input")
    WebElement designationBox;

    @FindBy(xpath = "//span[@class='dropArrowDD']")
    WebElement experienceDropdown;
    
    @FindBy(xpath = "//div[@class='dropdownPrimary']//ul//li")
    List<WebElement> yearOfExperience;

    @FindBy(xpath = "//div[@class='locationSugg']//input")
    WebElement locationBox;

    @FindBy(xpath = "//div[@class='qsbSubmit']")
    WebElement searchButton;

    /**
     * Fills the job designation in the search box
     * @param designation the job designation to be filled
     */
    public void fillDestination(String designation)
    {
        designationBox.sendKeys(designation);
    }

    /**
     * Selects the experience level from the dropdown
     * @param experience the index of the experience level to be selected
     */
    public void selectExperience(int experience)
    {
        experienceDropdown.click();
        DriverClass.pauseFor(3);
        yearOfExperience.get(experience).click();
    }

    /**
     * Fills the job location in the search box
     * @param location the job location to be filled
     */
    public void fillLocation(String location)
    {
        locationBox.sendKeys(location);
    }

    /**
     * Clicks the search button to initiate the job search
     */
    public void clickSearchButton()
    {
        searchButton.click();
    }
}
