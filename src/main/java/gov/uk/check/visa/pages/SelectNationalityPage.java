package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    /**
     * SelectNationalityPage -nationalityDropDownList, nextStepButton locators and create
     * methods 'void selectNationality(String nationality)'
     * and 'void clickNextStepButton()
     */
    //Select a Nationality 'Australia'
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement selectNationality;

//    public void selectNationality() {
//        clickOnElement(selectNationality);
//    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement selectNationality1;
    public void selectNationality(String nationality){
        selectByVisibleTextFromDropDown(selectNationality1,nationality);
        log.info("Select Nationality : " + selectNationality1.toString());
    }
    //Click on Continue button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickOnContinueButtonPostSelectingNationality;

    public void clickOnContinueButtonPostSelectingNationality() {
        clickOnElement(clickOnContinueButtonPostSelectingNationality);
        log.info("Clicking on continue button : " + clickOnContinueButtonPostSelectingNationality.toString());
    }
}
