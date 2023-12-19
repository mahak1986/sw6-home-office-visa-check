package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class SelectNationalitySteps {
    @And("User selects Australia as a nationality")
    public void userSelectsAustraliaAsANationality() {
        new SelectNationalityPage().selectNationality("Australia");


    }

    @Then("User clicks on continue button")
    public void userClicksOnContinueButton() {
        new SelectNationalityPage().clickOnContinueButtonPostSelectingNationality();
    }

    @And("User selects Chile as a nationality")
    public void userSelectsChileAsANationality() {
        new SelectNationalityPage().selectNationality("Chile");
    }

    @And("User selects Colombia as a nationality")
    public void userSelectsColombiaAsANationality() {
        new SelectNationalityPage().selectNationality("Colombia");
    }


        @Then("User can see following country into dropdown")
        public void userCanSeeFollowingCountryIntoDropdown(DataTable dataTable) {
            List<List<String>> userList = dataTable.asLists(String.class);
            for (List<String> list : userList) {
                //will print all the data
                System.out.println(list.get(0));
            }
    }
}
