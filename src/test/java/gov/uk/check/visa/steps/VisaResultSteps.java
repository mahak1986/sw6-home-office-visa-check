package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.FamilyImmigrationStatusPage;
import gov.uk.check.visa.pages.ResultPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class VisaResultSteps {
    @Then("User verifies the visa status result")
    public void userVerifiesTheVisaStatusResult() {
        String expectedMessage = "You will not need a visa to come to the UK";
        String actualMessage = new ResultPage().verifyVisaText();
        Assert.assertEquals(actualMessage, expectedMessage, "Visa Text not displayed");

    }

    @Then("User verify the visa status result")
    public void userVerifyTheVisaStatusResult() {
        String expectedMessage = "You need a visa to work in health and care";
        String actualMessage = new ResultPage().verifyNeedVisaText();
        Assert.assertEquals(actualMessage, expectedMessage, "Visa Text not displayed");
    }

    @Then("User will verify the visa status result")
    public void userWillVerifyTheVisaStatusResult() {
        String expectedMessage = "You may need a visa";
        String actualMessage = new FamilyImmigrationStatusPage().verifyTheMessageThatYouMayNeedVisaToJoinFamilyOrPartner();
        Assert.assertEquals(actualMessage, expectedMessage, "Visa Text not displayed");
    }
}
