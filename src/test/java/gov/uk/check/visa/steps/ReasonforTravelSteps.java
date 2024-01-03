package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ReasonForTravelPage;
import io.cucumber.java.en.And;

public class ReasonforTravelSteps {
    @And("User selects reason as Tourism")
    public void userSelectsReasonAsTourism() {
        new ReasonForTravelPage().clickOnTourismAsReasonForVisit();
    }

    @And("User selects reason as work, academic visit or business")
    public void userSelectsReasonAsWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().clickOnWorkAcademicVisitOrBusiness();
    }

    @And("User selects reason as join partner or family for a long stay")
    public void userSelectsReasonAsJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().clickOnJoinPartnerOrFamilyForALongStay();
    }
}
