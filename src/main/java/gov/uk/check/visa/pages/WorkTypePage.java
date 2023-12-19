package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());
    /**
     * .WorkTypePage - nextStepButton, selectJobtypeList locators and create methods 'void
     * selectJobType(String job)'
     * and 'void clickNextStepButton()'
     */

   //Select have planning to work for 'Health and care professional'
    @CacheLookup
    @FindBy(id = "response-0")
    WebElement clickOnHealthAndProfessionalWorkType;

    public void clickOnHealthAndProfessionalWorkType(){
        clickOnElement(clickOnHealthAndProfessionalWorkType);
        log.info("Clicking on radio button : " + clickOnHealthAndProfessionalWorkType.toString());
    }

    //Click on Continue button

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickOnContinueButtonPostWorkType;

    public void clickOnContinueButtonPostWorkType(){
        clickOnElement(clickOnContinueButtonPostWorkType);
        log.info("Clicking on cotinue button : " + clickOnContinueButtonPostWorkType.toString());
    }




}
