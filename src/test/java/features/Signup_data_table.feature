Feature: Amazon Sign up

@Regression
Scenario: Sign up multiple users to Amazon website
Given User is in Amazon Sign up Page
When User Sign up with following information
| firstname | lastname | address | mobile# | userid  | password |

Then Display the Amazon Login page for user to Sign in

@Mobile
Scenario: Login to Mobile App
Given User is in Youtube App
When User gives valid Youtube userid "Jack" and password "1234"
Then Display the Youtube Home Page with his videos playlist
And Display users Youtube Account Information

@Mobile
Scenario: Login to Mobile App
Given User is in Youtube App1
When User gives invalid Youtube userid "John" and password "4321"
Then Display the Youtube Home Page
And Display saying invalid user