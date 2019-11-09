package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkoutpage {
	
public WebDriver driver;
	
	//Constructor for getting the driver properties from Base.java file
	public Checkoutpage(WebDriver driver) {
		this.driver=driver;
	}
	
	By prodName=By.xpath("//p[@class='product-name']");
	
	public WebElement getProductName() {
		return driver.findElement(prodName);
	}

}
