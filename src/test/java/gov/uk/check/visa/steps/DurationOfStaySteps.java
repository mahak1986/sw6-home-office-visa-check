package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.DurationOfStayPage;
import io.cucumber.java.en.And;

public class DurationOfStaySteps {
    @And("User selects intent to stay for longer than six months")
    public void userSelectsIntentToStayForLongerThanSixMonths() {
        new DurationOfStayPage().clickOnLongerThan6MonthsStayButton();
    }
}
