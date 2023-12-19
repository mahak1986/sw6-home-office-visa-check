package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.WorkTypePage;
import io.cucumber.java.en.And;

public class WorkTypeSteps {
    @And("User selects Health and care professional")
    public void userSelectsHealthAndCareProfessional() {
        new WorkTypePage().clickOnHealthAndProfessionalWorkType();
    }
}
