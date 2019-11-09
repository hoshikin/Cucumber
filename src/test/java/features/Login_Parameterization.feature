Feature: Amazon Sign up


Background:
Given Validate the Browser
When Browser is Triggered
Then Check if Browser is Started

@Functional
Scenario Outline: Login to Amazon website using multiple users
Given User is in Amazon Login Page
When User Login into Amazon website using valid <Userid> and <Password>
Then Display the Amazon Home page
And Display User Account Information

Examples:
| Userid | Password |
| user1  | 11111111 |
| user2  | 22222222 |
| user3  | 33333333 |
| user4  | 44444444 |
| user5  | 55555555 |


