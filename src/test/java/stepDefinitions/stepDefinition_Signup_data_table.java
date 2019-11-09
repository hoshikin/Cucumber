package stepDefinitions;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition_Signup_data_table {
	
	@Given("^User is in Amazon Sign up Page$")
	public void user_is_in_Amazon_Sign_up_Page() throws Throwable {
	   
		System.out.println("User is in Amazon Sign up Page");
	}

	@When("^User Sign up with following information$")
	public void user_Sign_up_with_following_information(DataTable data) throws Throwable {
	    
		List<List<String>> obj=data.raw();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
		System.out.println(obj.get(0).get(5));
		
	}

	@Then("^Display the Amazon Login page for user to Sign in$")
	public void display_the_Amazon_Login_page_for_user_to_Sign_in() throws Throwable {
	    
		System.out.println("Display the Amazon Login page for user to Sign in");
		
	}
	
	@Given("^User is in Youtube App$")
    public void user_is_in_youtube_app() throws Throwable {
        
		System.out.println("User is in Youtube App");
    }

    @When("^User gives valid Youtube userid \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_gives_valid_youtube_userid_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

    @Then("^Display the Youtube Home Page with his videos playlist$")
    public void display_the_youtube_home_page_with_his_videos_playlist() throws Throwable {
        
    	System.out.println("Display the Youtube Home Page with his videos playlist");
    }

    @And("^Display users Youtube Account Information$")
    public void display_users_youtube_account_information() throws Throwable {
        
    	System.out.println("Display users Youtube Account Information");
    }
    
    
    @Given("^User is in Youtube App1$")
    public void user_is_in_youtube_app1() throws Throwable {
        
    	System.out.println("User is in Youtube App1");
    }

    @When("^User gives invalid Youtube userid \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_gives_invalid_youtube_userid_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

    @Then("^Display the Youtube Home Page$")
    public void display_the_youtube_home_page() throws Throwable {
    	
    	System.out.println("Display the Youtube Home Page");
    }

    @And("^Display saying invalid user$")
    public void display_saying_invalid_user() throws Throwable {
        
    	System.out.println("Display saying invalid user");
    }


}
