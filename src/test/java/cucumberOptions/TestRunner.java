package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		//glue="stepDefinitions", dryRun=true, monochrome=true, strict=true,
		glue="stepDefinitions", tags="@SeleniumTest1", monochrome=true, strict=true,
		plugin= {"html:target/cucumber", "json:target/cucumber.json", "junit:target/cukes.xml"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	

}
