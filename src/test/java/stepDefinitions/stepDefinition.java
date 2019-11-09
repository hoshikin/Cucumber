package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {

	@Given("^User is in Amazon Home Page$")
	public void user_is_in_Amazon_Home_Page() throws Throwable {
	    
		System.out.println("User is in Amazon Home page");
	}

	@When("^User gives valid userid \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_gives_valid_userid_and_password(String arg1, String arg2) throws Throwable {
	    
		System.out.println(arg1);
		System.out.println(arg2);
		
	}

	@Then("^Display the Home Page with username$")
	public void display_the_Home_Page_with_username() throws Throwable {
	    
		System.out.println("Display the Home Page with username");
		
	}
	
	@Then("^Display users card information \"([^\"]*)\"$")
	public void display_users_card_information(String arg1) throws Throwable {
		
		System.out.println(arg1);
		
	}

}