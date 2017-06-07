Feature: PassionTea_Demo

  Scenario: PassionTea_Script
    Given  User is in homepage and logout button is visible
    And  User clicks "Logout" button
	Then User should see "Logout" page


