package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.Checkoutpage;
import pageObjects.Homepage;
import resources.Base;

@RunWith(Cucumber.class)
public class stepDefinition_Search extends Base{
	
	//public WebDriver driver;
	public Homepage hp;
	public Checkoutpage cp;
	
	@Given("^User is in on GreenKart Landing page$")
    public void user_is_in_on_greenkart_landing_page() throws Throwable {
		
		driver=Base.getDriver();
		
    }

    @When("^User searched for \"([^\"]*)\" vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
        
    	hp=new Homepage(driver);
    	hp.getSearch().sendKeys(strArg1);
    	Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" vegetable is displayed$")
    public void something_vegetable_is_displayed(String strArg1) throws Throwable {
       
    	hp=new Homepage(driver);
    	Assert.assertTrue(hp.getProduct().getText().contains(strArg1));
    	System.out.println("Test Pass: " + strArg1);	
    	
    }
    
    @When("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
        
    	hp=new Homepage(driver);
    	hp.getButton().click();
    	hp.getAddCart().click();
    	
    }

    @When("^User proceeds to Checkout page for purchase$")
    public void user_proceeds_to_Checkout_page_for_purchase() throws Throwable {
        
    	hp=new Homepage(driver);
    	hp.getCartIcon().click();
    	hp.getCheckOut().click();
    	
    }
    
    @Then("^verify selected \"([^\"]*)\" items are displayed in Checkout page$")
    public void verify_selected_items_are_displayed_in_Checkout_page(String arg1) throws Throwable {
        
    	cp=new Checkoutpage(driver);
    	cp.getProductName().getText().contains(arg1);
    	System.out.println("Test Pass: " + arg1);
    	
    }

}
