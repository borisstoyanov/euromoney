Feature: Management Team 
	As a user
	I want to click the management team menu items
	So that we can see that the correct page is displayed

  Scenario: Verify that the URL of the first image is present
    Given I am on the ManagementTeamPage
     Then URLs of the following person is displayed: "ARashbass"
     
  Scenario: Management team page is displayed correctly
    Given I am on the ManagementTeamPage
     Then ManagementTeamPage is displayed correctly