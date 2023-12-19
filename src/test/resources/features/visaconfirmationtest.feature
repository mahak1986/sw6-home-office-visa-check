#1.anAustralianCominToUKForTourism.
#Click on start button
#Select a Nationality 'Australia'
#Click on Continue button
#Select reason 'Tourism'
#Click on Continue button
#verify result 'You will not need a visa to come to the UK'

Feature: Visa Confirmation Feature
  As a user I would like to verify my visa status

  @Mahak @sanity @smoke @regression
  Scenario: User should navigate to homepage successfully
    Given User is on homepage
    When User clicks on start button
    And User selects Australia as a nationality
    Then User clicks on continue button
    And User selects reason as Tourism
    Then User clicks on continue button
    And User verifies the visa status result

   #2.aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths.
   #Click on start button
   #Select a Nationality 'Chile'
   #Click on Continue button
   #Select reason 'Work, academic visit or business'
   #Click on Continue button
   #Select intendent to stay for 'longer than 6 months'
   #Click on Continue button
   #Select have planning to work for 'Health and care professional'
   #Click on Continue button
   #verify result 'You need a visa to work in health and care'

  @Mahak @smoke @regression
  Scenario: User should navigate to homepage successfully
    Given User is on homepage
    When  User clicks on start button
    And   User selects Chile as a nationality
    Then  User clicks on continue button
    And   User selects reason as work, academic visit or business
    Then  User clicks on continue button
    And   User selects intent to stay for longer than six months
    Then User clicks on continue button
    And User selects Health and care professional
    Then User clicks on continue button
    Then User verify the visa status result

    #3.aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card
    #Click on start button
    #Select a Nationality 'Colombia'
    #Click on Continue button
    #Select reason 'Join partner or family for a long stay'
    #Click on Continue button
    #Select state My partner of family member have uk immigration status 'yes'
    #Click on Continue button
    #verify result 'You’ll need a visa to join your family or partner in the UK'

  @Mahak @regression
  Scenario: User should navigate to homepage successfully
    Given User is on homepage
    When User clicks on start button
    And User selects Colombia as a nationality
    Then User clicks on continue button
    And User selects reason as join partner or family for a long stay
    Then User clicks on continue button
    Then User will verify the visa status result