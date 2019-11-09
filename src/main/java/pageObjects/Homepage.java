package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	public WebDriver driver;
	
	//Constructor for getting the driver properties from Base.java file
	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	
	By search=By.xpath("//input[@type='search']");
	
	By product=By.xpath("//h4[@class='product-name']");
	
	By plusButton=By.xpath("//a[@class='increment']");
	
	By addCartButton=By.xpath("//button[contains(text(),'ADD TO CART')]");
	
	By cartIcon=By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");
	
	By checkout=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	public WebElement getSearch() {
		
		return driver.findElement(search);
		
	}
	
	public WebElement getProduct() {
		
		return driver.findElement(product);
		
	}
	
	public WebElement getButton() {
		
		return driver.findElement(plusButton);
		
	}
	
	public WebElement getAddCart() {
		
		return driver.findElement(addCartButton);
		
	}
	
	public WebElement getCartIcon() {
		
		return driver.findElement(cartIcon);
		
	}
	
public WebElement getCheckOut() {
		
		return driver.findElement(checkout);
		
	}

}
