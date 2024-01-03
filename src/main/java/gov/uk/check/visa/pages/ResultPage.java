package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * .ResultPage - resultMessage locator and create methods 'String getResultMessage()' and
 * 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
 */
public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    //verify result 'You will not need a visa to come to the UK'
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement verifyVisaText;

    public String verifyVisaText(){
        log.info("Clicking on radio button : " + verifyVisaText.toString());
       return getTextFromElement(verifyVisaText);
    }

    //verify result 'You need a visa to work in health and care'

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement verifyNeedVisaText;

    public String verifyNeedVisaText(){
        log.info("Clicking on radio button : " + verifyNeedVisaText.toString());
       return getTextFromElement(verifyNeedVisaText);
    }

}
