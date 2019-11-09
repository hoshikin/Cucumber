$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search GreenKart and place order for Vegetables",
  "description": "",
  "id": "search-greenkart-and-place-order-for-vegetables",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 10,
  "name": "Search for items and then go to Checkout page",
  "description": "",
  "id": "search-greenkart-and-place-order-for-vegetables;search-for-items-and-then-go-to-checkout-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@SeleniumTest2"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User is in on GreenKart Landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User searched for \"Brinjal\" vegetable",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Added items to cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User proceeds to Checkout page for purchase",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "verify selected \"Brinjal\" items are displayed in Checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition_Search.user_is_in_on_greenkart_landing_page()"
});
formatter.result({
  "duration": 22036238403,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brinjal",
      "offset": 19
    }
  ],
  "location": "stepDefinition_Search.user_searched_for_something_vegetable(String)"
});
formatter.result({
  "duration": 9161007591,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Search.added_items_to_cart()"
});
formatter.result({
  "duration": 1359406101,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Search.user_proceeds_to_Checkout_page_for_purchase()"
});
formatter.result({
  "duration": 368138889,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brinjal",
      "offset": 17
    }
  ],
  "location": "stepDefinition_Search.verify_selected_items_are_displayed_in_Checkout_page(String)"
});
formatter.result({
  "duration": 67762395,
  "status": "passed"
});
formatter.after({
  "duration": 674815145,
  "status": "passed"
});
});