Feature: Hotel App Login
@SmokeTest 
Scenario: Login Successful
Given I am on Hotel App Login Page

When I enter username as "sriyaseth"
And I enter password as "Sriya@86"
And I click Login
Then I am logged in succesfully
 
@SanityTest
Scenario: Search location
Given I am on Search Hotel Page
When I enter username as "sriyaseth"
And I enter password as "Sriya@86"
And I click Login
And I am logged in succesfully 
And I search location as "Paris"
And click on the search button
Then I can see the hotel
