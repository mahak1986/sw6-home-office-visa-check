package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * ReasonForTravelPage - nextStepButton, reasonForVisitList locators and create methods
 * 'void selectReasonForVisit(String reason)'
 * and 'void clickNextStepButton()'
 */

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    //Select reason 'Tourism'
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement clickOnTourismAsReasonForVisit;

    public void clickOnTourismAsReasonForVisit() {
        clickOnElement(clickOnTourismAsReasonForVisit);
        log.info("Clicking on radio button : " + clickOnTourismAsReasonForVisit.toString());
    }

    //Select reason ''Work, academic visit or business'
    @CacheLookup
    @FindBy(id = "response-1")
    WebElement clickOnWorkAcademicVisitOrBusiness;

    public void clickOnWorkAcademicVisitOrBusiness() {
        clickOnElement(clickOnWorkAcademicVisitOrBusiness);
        log.info("Clicking on radio button : " + clickOnWorkAcademicVisitOrBusiness.toString());
    }

    //Select reason 'Join partner or family for a long stay'
    @CacheLookup
    @FindBy(id = "response-4")
    WebElement clickOnJoinPartnerOrFamilyForALongStay;

    public void clickOnJoinPartnerOrFamilyForALongStay() {
        clickOnElement(clickOnJoinPartnerOrFamilyForALongStay);
        log.info("Clicking on radio button : " + clickOnJoinPartnerOrFamilyForALongStay.toString());
    }

    //Click on Continue button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickOnContinueButtonPostSelectingReasonForVisit;

    public void clickOnContinueButtonPostSelectingReasonForVisit() {
        clickOnElement(clickOnContinueButtonPostSelectingReasonForVisit);
        log.info("Clicking on continue button : " + clickOnContinueButtonPostSelectingReasonForVisit.toString());
    }
}
