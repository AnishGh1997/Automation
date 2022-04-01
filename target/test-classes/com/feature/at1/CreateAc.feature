Feature: Create an account functionality

Scenario: Verify whether the application allows to click Create new account button successfully
Given User enter valid mail "hansiflick12349@gmail.com"
When User click create an account button
Then User verify the application navigates the correct page


Scenario: Verify whether the application allows to create an account successfully with valid credentials
Given user wants to choose gender
When user wants to enter firstname "hansi"
And user wants to enter lastname "flick"
And user wants to enter password "flick1234"
And user wants to enter DateofBirth
And user wants to enter Address
And user wants to choose city "Albuquerque"
And user wants to choose state
And user wants to enter Postalcode "00000"
And user wants to choose country
And user wants to enter MobileNumber "9876543211"
And user wants to click register 
Then user wants to validate  whether the application navigates to correct page


Scenario: verify whether the application allows to create an account wth invalid firstname lastname and password
Given User is on signin page
When User navigate to create an account page
And User choose Gender
And User enters Invalid firstname "123445"
And User enters Invalid lastname "@#$#$%"
And User enters Invalid password "@123"
And User enters Dateofbirth
And User enters the Address
And User choose the City "Albuquerque"
And User Choose the State
And User enters the Postalcode "00000"
And User choose the Country
And User enters the Mobilenumber "9876543211"
Then Verify the application shouldnot allow the user to create an account 
