Feature: Login to Pickx app

Background: The user opens the PickxTV app and login to Pickx app
Given User opens the PickxTV application
When The User selects the environment
And User select the login option
And User is on the login page
And The User enters credentials
Then User successfully log in to the Pickx app

Scenario: User verify logout option is available on the settings page
Given The user navigates to the settings page
When The user validates the logout button
Then The user navigates to the home page

#Scenario: User verify logout option is available on the settings page failure case
#Given The user navigates to the settings page failure case

#
#Scenario: User verify Live TV contents are available for his profile.
#Given The user navigates to the Live TV page
#When The user selects one video
#And The user validates live option is available
#Then The user returns to the home page
#
#Scenario: User verifies recordings tab
#Given The user navigates to the recordings page
#When The user checks both recorded and planned tabs are available
#Then The user navigates to the home page
#
#Scenario: User verifies date field in the TV guide
#Given The user navigates to the TV guide page
#When The user clicks on the date drop down to see the dates view
#Then The user navigates to the home page