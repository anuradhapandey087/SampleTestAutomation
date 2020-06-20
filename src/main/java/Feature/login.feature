Feature: Login test


@TestLogin
Scenario: login using user name and password
Given User is on home page 
When We entered email and password
And click on submit 
Then User navigate to welcome page
