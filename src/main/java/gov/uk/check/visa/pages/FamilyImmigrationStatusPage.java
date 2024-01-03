package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 6.FamilyImmigrationStatusPage - nextStepButton, yes, no locators and create methods 'void
 * selectImmigrationStatus(String status)'
 * (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'
 */
public class FamilyImmigrationStatusPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement mayNeedVisa;

    public String verifyTheMessageThatYouMayNeedVisaToJoinFamilyOrPartner() {
        log.info("Getting text from : " + mayNeedVisa.toString());
        return getTextFromElement(mayNeedVisa);
    }
}

