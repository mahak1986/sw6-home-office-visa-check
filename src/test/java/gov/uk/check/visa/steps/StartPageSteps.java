package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.StartPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StartPageSteps {
    private DataTable dataTable;

    @Given("User is on homepage")
    public void userIsOnHomepage() {
        System.out.println("User is on Homepage");
    }

    @When("User clicks on start button")
    public void userClicksOnStartButton() {
        new StartPage().clickStartNow();
    }

}
