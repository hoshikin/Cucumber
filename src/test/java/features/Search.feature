Feature: Search GreenKart and place order for Vegetables

@SeleniumTest1
Scenario: Search for items and validate results
Given User is in on GreenKart Landing page
When User searched for "Cucumber" vegetable
Then "Cucumber" vegetable is displayed

@SeleniumTest2
Scenario: Search for items and then go to Checkout page
Given User is in on GreenKart Landing page
When User searched for "Brinjal" vegetable
And Added items to cart
And User proceeds to Checkout page for purchase
Then verify selected "Brinjal" items are displayed in Checkout page
