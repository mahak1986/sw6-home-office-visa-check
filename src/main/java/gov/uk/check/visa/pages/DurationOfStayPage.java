package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    //Select intent to stay for 'longer than 6 months'
    @CacheLookup
    @FindBy(id = "response-1")
    WebElement clickOnLongerThan6MonthsStayButton;

    public void clickOnLongerThan6MonthsStayButton(){
        clickOnElement(clickOnLongerThan6MonthsStayButton);
        log.info("Clicking on radio button : " + clickOnLongerThan6MonthsStayButton.toString());
    }

    //Click on continue button

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Continue']")
    WebElement clickOnContinueButtonPostSelectingStayDuration;

    public void clickOnContinueButtonPostSelectingStayDuration(){
        clickOnElement(clickOnContinueButtonPostSelectingStayDuration);
        log.info("Clicking on continue button : " + clickOnContinueButtonPostSelectingStayDuration.toString());
    }

}
