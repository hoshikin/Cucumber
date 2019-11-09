package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop=new Properties();
	
	public static WebDriver getDriver() throws IOException {
		
		//Below code is to set the path of env.properties variables into your current project directory
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src////main//java//resources//global.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//main//java//resources//chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(prop.getProperty("URL"));
		
		return driver;
		
	}

}
