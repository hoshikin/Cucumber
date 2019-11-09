Feature: Amazon Application Login

@Smoke
Scenario: Login to Amazon Home Page
Given User is in Amazon Home Page
When User gives valid userid "Jack" and password "1234"
Then Display the Home Page with username
And Display users card information "true"

@Smoke
Scenario: Login to Amazon Home Page
Given User is in Amazon Home Page
When User gives valid userid "John" and password "4321"
Then Display the Home Page with username
And Display users card information "false"

