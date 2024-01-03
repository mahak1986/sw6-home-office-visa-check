package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * StartPage - startNowButton locators and create method 'void clickStartNow()'
 */
public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());
    //Click on start now button
    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startNowButton;
    public void clickStartNow() {
        clickOnElement(startNowButton);
        log.info("Clicking on start button : " + startNowButton.toString());

    }
}
