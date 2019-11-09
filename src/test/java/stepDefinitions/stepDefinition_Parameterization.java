package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition_Parameterization {
	
	@Given("^Validate the Browser$")
    public void validate_the_browser() throws Throwable {
        
		System.out.println("************* @Background - Start ************");
		System.out.println("Validate the Browser");
		
    }

    @When("^Browser is Triggered$")
    public void browser_is_triggered() throws Throwable {
        
    	System.out.println("Check if Browser is Triggered");
    	
    }

    @Then("^Check if Browser is Started$")
    public void check_if_browser_is_started() throws Throwable {
        
    	System.out.println("Check if Browser is Started");
    	
    }

	
	@Given("^User is in Amazon Login Page$")
	public void user_is_in_Amazon_Login_Page() throws Throwable {
	    
		System.out.println("User is in Amazon Login Page");
		System.out.println("************* @Background - End ************");
		
	}

	@When("^User Login into Amazon website using valid (.+) and (.+)$")
    public void user_login_into_amazon_website_using_valid_and(String userid, String password) throws Throwable {
	    
		System.out.println("Userid: "+ userid);
		System.out.println("Password: "+ password);
		
	}

	@Then("^Display the Amazon Home page$")
	public void display_the_Amazon_Home_page() throws Throwable {
	    
		System.out.println("Display the Amazon Home page");
		
	}

	@Then("^Display User Account Information$")
	public void display_User_Account_Information() throws Throwable {
	    
		System.out.println("Display User Account Information");
		
	}


}
