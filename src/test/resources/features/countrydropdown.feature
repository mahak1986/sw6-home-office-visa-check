#2.countrydropdown.feature write following scenario
#Scenario: Verify the following country available in country dropdown list
#Given I am on home page
#When I click on start button
#Then I can see following country into dropdown
#|albania|
#|bhutan|
#|british-protected-person|
#|haiti|
#|kazakhstan|
#|mozambique|
#|norway|
#|portugal|
#|russia|
#|zambia|


Feature: Country Dropdown Feature

  @Mahak @sanity @smoke @regression
  Scenario: Verify the following countries available in country dropdown list
    Given User is on homepage
    When User clicks on start button
    Then  User can see following country into dropdown
      | albania                  |
      | bhutan                   |
      | british-protected-person |
      | haiti                    |
      | kazakhstan               |
      | mozambique               |
      | norway                   |
      | portugal                 |
      | russia                   |
      | zambia                   |
